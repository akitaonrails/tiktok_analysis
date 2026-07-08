package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.dynamic.card.api.DynamicCardService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import njp.a;
import okio.ByteString;

/* JADX INFO: renamed from: X.06te, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet$bind$1", f = "ShareToUserSheet.kt", l = {312}, m = "invokeSuspend")
public final class C1752406te extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super View>, Object> {
    public int LL;
    public final /* synthetic */ ByteString LLILLJJLI;
    public final /* synthetic */ IMContact LLILLL;
    public final /* synthetic */ ShareToUserSheet LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752406te(ByteString byteString, IMContact iMContact, ShareToUserSheet shareToUserSheet, InterfaceC1364105Vn<? super C1752406te> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = byteString;
        this.LLILLL = iMContact;
        this.LLILZ = shareToUserSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1752406te(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super View> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        String str;
        Object objLIZJ = obj;
        C1C7U.LIZ("ShareToUserSheet@b46a.bind$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZJ);
            C844470XAv.LIZ.getClass();
            FrameLayout frameLayout = new FrameLayout(C844470XAv.LIZ());
            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-2, -2));
            DynamicCardService.LIZ.getClass();
            DynamicCardService value = C1765306vj.LIZIZ.getValue();
            ByteString byteString = this.LLILLJJLI;
            IMContact iMContact = this.LLILLL;
            if (iMContact == null || (uid = iMContact.getUid()) == null) {
                uid = "";
            }
            Float fLIZLLL = C2286608xc.LIZLLL(0.7f);
            Pair[] pairArr = new Pair[4];
            pairArr[0] = new Pair("biz_container_type", "share_panel");
            pairArr[1] = new Pair("disable_card_click", true);
            pairArr[2] = new Pair("transform_scale", C2286608xc.LIZLLL(0.7f));
            this.LLILZ.getClass();
            if (C0H4W.LIZ()) {
                str = "right top";
            } else {
                str = "left top";
            }
            pairArr[3] = new Pair("transform_origin", str);
            Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("im_chat_youthful_design_experiment", C2286608xc.LJ(3)));
            AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this.LLILZ, 1096);
            this.LL = 1;
            objLIZJ = value.LIZJ(frameLayout, byteString, uid, fLIZLLL, mapLJIIIIZZ, mapLIZJ, AFwS187S0000000_2.get$arr$(1042), awS546S0100000_2, this);
            if (objLIZJ == objLJFF) {
                C1C7U.LIZIZ("ShareToUserSheet@b46a.bind$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ShareToUserSheet@b46a.bind$1");
        return objLIZJ;
    }
}
