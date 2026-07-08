package X;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.kyc.singpass.PipoMiddleActivity;
import com.bytedance.pipo.kyc.singpass.network.model.CodeChallengeParams;
import com.bytedance.pipo.kyc.singpass.network.model.Config;
import com.bytedance.router.monitor.RouterPageMonitor;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vN1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.kyc.singpass.PIPOKYCSingPassCompat$startVerify$1$1", f = "PIPOKYCSingPassCompat.kt", l = {}, m = "invokeSuspend")
public final class C1739610vN1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1739580vMy LL;
    public final /* synthetic */ Pair LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739610vN1(C1739580vMy c1739580vMy, Pair pair, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1739580vMy;
        this.LLILLJJLI = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739610vN1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PIPOKYCSingPassCompat@caf1.startVerify$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CodeChallengeParams codeChallengeParams = (CodeChallengeParams) this.LLILLJJLI.getFirst();
        if (codeChallengeParams != null) {
            if (codeChallengeParams.sessionId.length() != 0 && codeChallengeParams.config.clientId.length() != 0 && codeChallengeParams.config.authorizationEndpoint.length() != 0 && codeChallengeParams.config.tokenEndpoint.length() != 0 && codeChallengeParams.config.issuer.length() != 0 && codeChallengeParams.config.purposeId.length() != 0 && codeChallengeParams.codeChallenge.length() != 0 && codeChallengeParams.codeChallengeMethod.length() != 0 && C08NE.LIZ(codeChallengeParams.config.authorizationEndpoint) && C08NE.LIZ(codeChallengeParams.config.tokenEndpoint)) {
                C1739550vMv.LJFF = codeChallengeParams.sessionId;
                C1739490vMp c1739490vMp = this.LL.LLILLJJLI;
                Uri uri = UriProtector.parse(codeChallengeParams.config.authorizationEndpoint);
                Uri uri2 = UriProtector.parse(codeChallengeParams.config.tokenEndpoint);
                Config config = codeChallengeParams.config;
                String str = config.clientId;
                String str2 = codeChallengeParams.codeChallenge;
                String str3 = codeChallengeParams.codeChallengeMethod;
                String str4 = config.scope;
                String str5 = config.purposeId;
                c1739490vMp.getClass();
                C2193471Asz c2193471Asz = new C2193471Asz(new C2193451Asx(uri, uri2, null), str, "code", UriProtector.parse(C1739550vMv.LJ));
                if (TextUtils.isEmpty(str4)) {
                    c2193471Asz.LJII = null;
                } else {
                    c2193471Asz.LIZJ(str4.split(" +"));
                }
                c2193471Asz.LIZIZ(str2, str2, str3);
                c2193471Asz.LJIIIIZZ = null;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("purpose_id", str5);
                if (!linkedHashMap.isEmpty()) {
                    c2193471Asz.LJIILIIL = C1278804zS.LIZ(linkedHashMap, C2193461Asy.LJIILJJIL);
                }
                C1739550vMv.LIZIZ = c2193471Asz.LIZ();
                C1739580vMy c1739580vMy = this.LL;
                C1739550vMv.LIZJ = c1739580vMy.LLILZIL;
                Activity activity = c1739580vMy.LLILLJJLI.LIZ;
                Intent intent = new Intent(this.LL.LLILLJJLI.LIZ, (Class<?>) PipoMiddleActivity.class);
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhxwDT2MyJBhQ3B71Vb7zIP15Dp/FvyEM0590Y6HWQESFsbg=", null);
                C0WST c0wst = new C0WST();
                Object[] objArr = {intent};
                C0WZW c0wzw = new C0WZW(false, "(Landroid/content/Intent;)V", c0wzx);
                C0WSU c0wsuLIZIZ = c0wst.LIZIZ(11098, "androidx/activity/ComponentActivity", "startActivity", activity, objArr, "void", c0wzw);
                if (c0wsuLIZIZ.LIZ) {
                    c0wst.LIZ(11098, "androidx/activity/ComponentActivity", "startActivity", null, objArr, activity, c0wzw, false);
                } else {
                    Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                    if (objArr2 != null) {
                        Object obj2 = objArr2[0];
                        if (obj2 != null) {
                            activity = (Activity) obj2;
                        }
                        Object obj3 = objArr2[1];
                        if (obj3 != null) {
                            intent = (Intent) obj3;
                        }
                    }
                    activity.startActivity(intent);
                    c0wst.LIZ(11098, "androidx/activity/ComponentActivity", "startActivity", null, objArr, activity, c0wzw, true);
                }
            } else {
                this.LL.LLILLJJLI.LIZJ.LIZ(null, new C1739500vMq(103, "illegal auth params"));
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PIPOKYCSingPassCompat@caf1.startVerify$1$1");
                return unit;
            }
        } else {
            C1739490vMp c1739490vMp2 = this.LL.LLILLJJLI;
            this.LLILLJJLI.getSecond();
            this.LLILLJJLI.getSecond();
            c1739490vMp2.LIZJ.LIZ(null, new C1739500vMq(102, "fail to fetch auth params"));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PIPOKYCSingPassCompat@caf1.startVerify$1$1");
        return unit2;
    }
}
