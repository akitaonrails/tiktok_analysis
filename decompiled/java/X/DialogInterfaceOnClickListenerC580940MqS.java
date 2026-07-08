package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import java.util.List;

/* JADX INFO: renamed from: X.0MqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class DialogInterfaceOnClickListenerC580940MqS implements DialogInterface.OnClickListener {
    public final int $t;
    public Object l0;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.$t) {
            case 0:
                onClick$0(this, dialogInterface, i);
                break;
            case 1:
                onClick$1(this, dialogInterface, i);
                break;
            case 2:
                onClick$2(this, dialogInterface, i);
                break;
        }
    }

    public DialogInterfaceOnClickListenerC580940MqS(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onClick$0(DialogInterfaceOnClickListenerC580940MqS dialogInterfaceOnClickListenerC580940MqS, DialogInterface dialogInterface, int i) {
        MvChoosePhotoScene.onFinish$default((MvChoosePhotoScene) dialogInterfaceOnClickListenerC580940MqS.l0, false, null, 2, null);
    }

    public static final void onClick$1(DialogInterfaceOnClickListenerC580940MqS dialogInterfaceOnClickListenerC580940MqS, DialogInterface dialogInterface, int i) {
        C574750MgT c574750MgT = C574750MgT.LIZ;
        VideoEditViewModel videoEditViewModel = ((C1173030gdB) dialogInterfaceOnClickListenerC580940MqS.l0).LLJJJ;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
        ((C1173030gdB) dialogInterfaceOnClickListenerC580940MqS.l0).getClass();
        c574750MgT.getClass();
        C574750MgT.LIZLLL("exit_clip_popup_cancel", listZQ2);
    }

    public static final void onClick$2(DialogInterfaceOnClickListenerC580940MqS dialogInterfaceOnClickListenerC580940MqS, DialogInterface dialogInterface, int i) {
        Activity activity = ((C1173030gdB) dialogInterfaceOnClickListenerC580940MqS.l0).mActivity;
        if (activity != null) {
            activity.finish();
        }
        C574750MgT c574750MgT = C574750MgT.LIZ;
        VideoEditViewModel videoEditViewModel = ((C1173030gdB) dialogInterfaceOnClickListenerC580940MqS.l0).LLJJJ;
        if (videoEditViewModel == null) {
            videoEditViewModel = null;
        }
        List<VideoSegment> listZQ2 = videoEditViewModel.zQ2();
        ((C1173030gdB) dialogInterfaceOnClickListenerC580940MqS.l0).getClass();
        c574750MgT.getClass();
        C574750MgT.LIZLLL("exit_clip_popup_confirm", listZQ2);
    }
}
