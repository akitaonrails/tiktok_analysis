package X;

import com.ss.android.ugc.aweme.TTC2PAServiceImpl;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09Wi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.TTC2PAServiceImpl$mobEvent$1", f = "TTC2PAServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C2385409Wi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ TTC2PAServiceImpl LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C15464063q LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2385409Wi(String str, boolean z, TTC2PAServiceImpl tTC2PAServiceImpl, String str2, long j, String str3, int i, boolean z2, C15464063q c15464063q, InterfaceC1364105Vn<? super C2385409Wi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = tTC2PAServiceImpl;
        this.LLILZ = str2;
        this.LLILZIL = j;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = z2;
        this.LLJ = c15464063q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2385409Wi(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        VEUtils.VEVideoFileInfo videoFileInfo;
        Object objLIZIZ;
        C1C7U.LIZ("TTC2PAServiceImpl@d36f.mobEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        double d = 1024;
        double length = (new C0VSJ(this.LL).length() / d) / d;
        if (this.LLILLJJLI) {
            videoFileInfo = VEUtils.getVideoFileInfo(this.LL);
        } else {
            videoFileInfo = null;
        }
        InterfaceC2227891CHr interfaceC2227891CHr = this.LLILLL.ttC2PADependWrapper;
        if (interfaceC2227891CHr != null) {
            JSONObject jSONObject = new JSONObject();
            Object obj2 = this.LLILZ;
            long j = this.LLILZIL;
            String str = this.LL;
            boolean z = this.LLILLJJLI;
            TTC2PAServiceImpl tTC2PAServiceImpl = this.LLILLL;
            String str2 = this.LLILZLL;
            int i = this.LLIZ;
            boolean z2 = this.LLIZLLLIL;
            C15464063q c15464063q = this.LLJ;
            jSONObject.put("uploaded_from", obj2);
            jSONObject.put("running_time", j);
            jSONObject.put("asset_format", a0.LJJLJ('.', str, str));
            if (z) {
                jSONObject.put("asset_type", tTC2PAServiceImpl.getMediaType(str));
                jSONObject.put("error_msg", str2);
            } else {
                if (C123100dR.LIZ(str2)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(" | vesdk_not_init");
                    objLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    objLIZIZ = "vesdk_not_init";
                }
                jSONObject.put("error_msg", objLIZIZ);
            }
            jSONObject.put("asset_size", length);
            if (videoFileInfo != null) {
                jSONObject.put("asset_duration", ((double) videoFileInfo.duration) / ((double) LSPassThroughRecordSizeConfig.DEFAULT));
                jSONObject.put("asset_resolution_width", C2286608xc.LJ(videoFileInfo.width));
                jSONObject.put("asset_resolution_height", C2286608xc.LJ(videoFileInfo.height));
            }
            jSONObject.put("error_code", i);
            jSONObject.put("hit_cache", z2 ? 1 : 0);
            jSONObject.put("creation_id", c15464063q.LIZ);
            interfaceC2227891CHr.LIZIZ(jSONObject);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TTC2PAServiceImpl@d36f.mobEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
