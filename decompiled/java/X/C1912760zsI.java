package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.MaskExtraModule;
import com.ss.android.ugc.aweme.feed.model.MaskPopText;
import com.ss.android.ugc.aweme.feed.model.MaskPopWindow;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS271S0000000_28;

/* JADX INFO: renamed from: X.0zsI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C1912760zsI extends C2217421BqW implements Function1<String, Unit> {
    public C1912760zsI(C101K c101k) {
        super(1, c101k, C101K.class, "onClickLink", "onClickLink(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        MaskExtraModule maskExtraModule;
        MaskPopWindow maskPopWindow;
        FragmentManager fragmentManager;
        C101K c101k = (C101K) this.receiver;
        c101k.getClass();
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("scenario", "general");
        String aid = c101k.LIZIZ.getAid();
        String str2 = "";
        if (aid == null) {
            aid = "";
        }
        pairArr[1] = new Pair("group_id", aid);
        C20684815ws.LJIILLIIL("tns_mask_layer_click_learnmore", C2097608Jq.LJIIIIZZ(pairArr));
        VideoMaskInfo generalMaskInfo = c101k.LIZIZ.getGeneralMaskInfo();
        if (generalMaskInfo != null && (maskExtraModule = generalMaskInfo.popWindow) != null && (maskPopWindow = maskExtraModule.popWindow) != null) {
            ArrayList arrayList = new ArrayList();
            List<MaskPopText> list = maskPopWindow.content;
            if (list != null) {
                for (MaskPopText maskPopText : list) {
                    TextWithInlineLink textWithInlineLink = maskPopText.linkText;
                    if (textWithInlineLink != null) {
                        arrayList.add(new C345890DhD(ComplianceServiceProvider.LJI().LJIL(c101k.LIZ, textWithInlineLink), maskPopText.isListItem()));
                    }
                }
            }
            Fragment fragment = c101k.LIZJ;
            if (fragment != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                C770750ULh c770750ULh = new C770750ULh();
                String str3 = maskPopWindow.title;
                if (str3 == null) {
                    str3 = "";
                }
                c770750ULh.LJ = str3;
                c770750ULh.LJIILLIIL = true;
                c770750ULh.LJI(c101k.LIZ.getString(2131821883), AFwS271S0000000_28.get$arr$(11));
                c770750ULh.LIZLLL(arrayList);
                c770750ULh.LIZIZ().LIZ.show(fragmentManager, "general_mask_learn_more_sheet");
                Pair[] pairArr2 = new Pair[2];
                pairArr2[0] = new Pair("scenario", "general");
                String aid2 = c101k.LIZIZ.getAid();
                if (aid2 != null) {
                    str2 = aid2;
                }
                pairArr2[1] = new Pair("group_id", str2);
                C20684815ws.LJIILLIIL("tns_show_mask_layer_popup", C2097608Jq.LJIIIIZZ(pairArr2));
            }
        }
        return Unit.LIZ;
    }
}
