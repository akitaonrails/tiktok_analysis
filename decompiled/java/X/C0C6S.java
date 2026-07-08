package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0C6S, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C6S extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0C6R LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C118300cf LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C259800zU<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0C6S(C0C6R c0c6r, String str, C118300cf c118300cf, C118300cf c118300cf2, long j, long j2, boolean z, C259800zU<String> c259800zU) {
        super(0);
        this.LL = c0c6r;
        this.LLILLJJLI = str;
        this.LLILLL = c118300cf;
        this.LLILZ = c118300cf2;
        this.LLILZIL = j;
        this.LLILZLL = j2;
        this.LLIZ = z;
        this.LLIZLLLIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String str = this.LLILLJJLI;
        C118300cf c118300cf = this.LLILLL;
        C118300cf c118300cf2 = this.LLILZ;
        long j = this.LLILZIL;
        long j2 = this.LLILZLL;
        boolean z = this.LLIZ;
        C259800zU<String> c259800zU = this.LLIZLLLIL;
        jSONObject.put("repo_name", str);
        jSONObject.put("repo_key_count", c118300cf.element);
        jSONObject.put("repo_init_code", c118300cf2.element);
        jSONObject.put("repo_init_time", (j - j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        jSONObject.put("repo_init_thread", !z ? 1 : 0);
        String str2 = c259800zU.element;
        if (str2 != null) {
            jSONObject.put("error_message", str2);
        }
        C0C6R c0c6r = this.LL;
        synchronized (c0c6r.LJJIFFI) {
            try {
                c0c6r.LJJIFFI.put(jSONObject);
                Keva keva = c0c6r.LJIIL;
                if (keva != null) {
                    keva.storeString(c0c6r.LJ, c0c6r.LJJIFFI.toString());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return Unit.LIZ;
    }
}
