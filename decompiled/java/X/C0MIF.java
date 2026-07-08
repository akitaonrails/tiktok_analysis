package X;

import com.ss.android.ugc.aweme.aime.IAIMEServices;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS189S1100000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0MIF, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.ScanFaceEffectComponent$processPhotoCaptured$1$1$callback$1$onPictureUploaded$1", f = "ScanFaceEffectComponent.kt", l = {}, m = "invokeSuspend")
public final class C0MIF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MIK LL;
    public final /* synthetic */ List<C0MI6> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MIF(C0MIK c0mik, List<C0MI6> list, String str, InterfaceC1364105Vn<? super C0MIF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mik;
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MIF(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        String str;
        C1C7U.LIZ("ScanFaceEffectComponent@ddfc.processPhotoCaptured$1$1$callback$1$onPictureUploaded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0MIK c0mik = this.LL;
        List<C0MI6> list = this.LLILLJJLI;
        String str2 = this.LLILLL;
        c0mik.LJIILJJIL = list;
        InterfaceC1645720sva effectController = c0mik.LIZLLL.getEffectController();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("msg", "picture_upload_result");
        effectController.sendEffectMsg(41, 0L, 0L, C786410Ut5.J3(jSONObject));
        IAIMEServices iAIMEServices = c0mik.LJ;
        if (iAIMEServices != null) {
            C19EG c19eg = (C19EG) c0mik.LJIIIIZZ;
            if (c0mik.LJIIL) {
                str = null;
            } else {
                str = str2;
            }
            String str3 = c0mik.LJIIJ;
            ShortVideoContext shortVideoContext = c0mik.LJIIIZ;
            String str4 = shortVideoContext.shootWay;
            if (str4 == null) {
                str4 = "";
            }
            String creationId = shortVideoContext.getCreationId();
            boolean z = c0mik.LJIJJLI;
            String str5 = c0mik.LJIL;
            String str6 = str4;
            iAIMEServices.LJIILJJIL(c19eg, list, str, null, AFwS194S0000000_8.get$arr$(138), str3, str3, str6, null, 0, c0mik.LJIJJ, z, str5, creationId, null, new AwS552S0100000_8(c0mik, 196), new AwS189S1100000_8(c0mik, str2, 0));
        }
        C566110MIf.LIZ.getClass();
        C566110MIf.LJ("upload_imagex", true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ScanFaceEffectComponent@ddfc.processPhotoCaptured$1$1$callback$1$onPictureUploaded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
