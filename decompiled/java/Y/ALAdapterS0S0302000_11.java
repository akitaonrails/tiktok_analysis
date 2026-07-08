package Y;

import X.C0SVN;
import X.C0SVO;
import X.C1388190mED;
import X.C1440005kM;
import X.C726120Se2;
import X.InterfaceC2217461Bqa;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerAddPhotoAssem;
import com.ss.android.ugc.aweme.comment.photocomment.CommentInnerCreateYourVersionAseem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class ALAdapterS0S0302000_11 extends AnimatorListenerAdapter {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0302000_11 aLAdapterS0S0302000_11, Animator animator) {
        int iIntValue;
        CommentCommonModel commonModel;
        Integer num;
        Activity activityLIZ;
        Context context = ((CommentInnerAddPhotoAssem) aLAdapterS0S0302000_11.l0).getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.finish();
        }
        Intent intent = (Intent) aLAdapterS0S0302000_11.l1;
        int i = aLAdapterS0S0302000_11.i3;
        int i2 = aLAdapterS0S0302000_11.i4;
        ArrayList arrayList = (ArrayList) aLAdapterS0S0302000_11.l2;
        CommentInnerAddPhotoAssem commentInnerAddPhotoAssem = (CommentInnerAddPhotoAssem) aLAdapterS0S0302000_11.l0;
        C726120Se2 c726120Se2 = commentInnerAddPhotoAssem.LLJJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentInnerAddPhotoAssem.LLJJJJLIIL;
        String strFromPage = CommentContextSourceKt.fromPage(c726120Se2.LIZ(commentInnerAddPhotoAssem));
        if (strFromPage == null) {
            strFromPage = "";
        }
        CommentInnerAddPhotoAssem commentInnerAddPhotoAssem2 = (CommentInnerAddPhotoAssem) aLAdapterS0S0302000_11.l0;
        CommentContextSource commentContextSourceLIZ = commentInnerAddPhotoAssem2.LLJJJJ.LIZ(commentInnerAddPhotoAssem2);
        if (commentContextSourceLIZ != null && (commonModel = commentContextSourceLIZ.getCommonModel()) != null && (num = commonModel.panelSessionCode) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C1440005kM.LIZ(new C0SVN(intent, i, i2, arrayList, strFromPage, iIntValue));
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0302000_11 aLAdapterS0S0302000_11, Animator animator) {
        int iIntValue;
        CommentCommonModel commonModel;
        Integer num;
        Activity activityLIZ;
        Context context = ((CommentInnerCreateYourVersionAseem) aLAdapterS0S0302000_11.l0).getContext();
        if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
            activityLIZ.finish();
        }
        Intent intent = (Intent) aLAdapterS0S0302000_11.l1;
        int i = aLAdapterS0S0302000_11.i3;
        int i2 = aLAdapterS0S0302000_11.i4;
        ArrayList arrayList = (ArrayList) aLAdapterS0S0302000_11.l2;
        String strFromPage = CommentContextSourceKt.fromPage(((CommentInnerCreateYourVersionAseem) aLAdapterS0S0302000_11.l0).cp());
        if (strFromPage == null) {
            strFromPage = "";
        }
        CommentContextSource commentContextSourceCp = ((CommentInnerCreateYourVersionAseem) aLAdapterS0S0302000_11.l0).cp();
        if (commentContextSourceCp != null && (commonModel = commentContextSourceCp.getCommonModel()) != null && (num = commonModel.panelSessionCode) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        C1440005kM.LIZ(new C0SVO(intent, i, i2, arrayList, strFromPage, iIntValue));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ALAdapterS0S0302000_11(Object obj, CommentInnerAddPhotoAssem commentInnerAddPhotoAssem, Intent intent, int i, int i2, ArrayList<CommentImageModel> arrayList) {
        this.$t = arrayList;
        this.l0 = obj;
        this.l1 = commentInnerAddPhotoAssem;
        this.i3 = intent;
        this.i4 = i;
        this.l2 = i2;
    }
}
