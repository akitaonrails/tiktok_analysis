package X;

import Y.ACListenerS113S0200000_9;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoType;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;
import com.ss.android.ugc.aweme.prop.fragment.StickerPropDetailFragment;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ohh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment$onEditButtonClick$1", f = "DesignerStickerDetailAwemeListFragment.kt", l = {239}, m = "invokeSuspend")
public final class C626470Ohh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ DesignerStickerDetailAwemeListFragment LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C626470Ohh(Aweme aweme, View view, DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment, String str, InterfaceC1364105Vn<? super C626470Ohh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = view;
        this.LLILZ = designerStickerDetailAwemeListFragment;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C626470Ohh(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String secAuthorUid;
        C1C7U.LIZ("DesignerStickerDetailAwemeListFragment@7e8.onEditButtonClick$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Aweme aweme = this.LLILLJJLI;
            if (aweme != null && (secAuthorUid = AwemeExtKt.getSecAuthorUid(aweme)) != null) {
                String str = this.LLILZIL;
                C615450OBz.LIZIZ = "clickType";
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", "prop_page");
                c2344009Gk.LJIIIIZZ("prop_id", str);
                c2344009Gk.LJIIIIZZ("prop_author_id", secAuthorUid);
                c2344009Gk.LJIIIIZZ("enter_method", "clickType");
                c2344009Gk.LIZJ(1, "is_prop_author_video");
                C20684815ws.LJIILLIIL("edit_featured_video", c2344009Gk.LIZ);
            }
            Aweme aweme2 = this.LLILLJJLI;
            if (aweme2 != null && this.LLILLL != null) {
                if (AwemeBizExtKt.isFeatureVideo(aweme2) == VideoType.FEATURE_VIDEO_CLIENT_SELECTED) {
                    DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment = this.LLILZ;
                    Aweme aweme3 = this.LLILLJJLI;
                    designerStickerDetailAwemeListFragment.getClass();
                    C1390850mIV c1390850mIV = new C1390850mIV();
                    c1390850mIV.LIZ.LL = new C0P4K(aweme3, designerStickerDetailAwemeListFragment, 0);
                    C1247510iZJ c1247510iZJ = new C1247510iZJ();
                    c1247510iZJ.LIZ = designerStickerDetailAwemeListFragment.getString(2131833521);
                    c1247510iZJ.LJ = new ACListenerS113S0200000_9(aweme3, designerStickerDetailAwemeListFragment, 43);
                    C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
                    c1247510iZJ2.LIZ = designerStickerDetailAwemeListFragment.getString(2131833519);
                    c1247510iZJ2.LJ = new ACListenerS113S0200000_9(aweme3, designerStickerDetailAwemeListFragment, 44);
                    c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
                    TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
                    FragmentManager fragmentManager = designerStickerDetailAwemeListFragment.getFragmentManager();
                    if (fragmentManager != null) {
                        tuxActionSheetLIZJ.show(fragmentManager, "edit_featured_video");
                    }
                } else {
                    NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) C13LP.LJJJLL(this.LLILZ.LLJLLIL);
                    if (newFaceStickerBean != null) {
                        C20684815ws.LJIILLIIL("click_ame_encourage_post_card", C322490CkZ.LIZ(newFaceStickerBean, this.LLILZ.LLLLILI, !r0.LLLL));
                    }
                    DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment2 = this.LLILZ;
                    Aweme aweme4 = this.LLILLJJLI;
                    this.LL = 1;
                    obj = designerStickerDetailAwemeListFragment2.zS(aweme4, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("DesignerStickerDetailAwemeListFragment@7e8.onEditButtonClick$1");
                        return objLJFF;
                    }
                }
            }
            this.LLILZ.LLLLIIIILLL = false;
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DesignerStickerDetailAwemeListFragment@7e8.onEditButtonClick$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC626480Ohi interfaceC626480Ohi = this.LLILZ.LLLLIL;
            if (interfaceC626480Ohi != null) {
                ((StickerPropDetailFragment) interfaceC626480Ohi).yS(this.LLILLL, "prop_page_encourage_post");
            }
        } else {
            this.LLILZ.yS(this.LLILLJJLI);
        }
        this.LLILZ.LLLLIIIILLL = false;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DesignerStickerDetailAwemeListFragment@7e8.onEditButtonClick$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
