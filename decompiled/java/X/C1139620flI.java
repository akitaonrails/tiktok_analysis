package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0flI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1139620flI extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LiveEffect LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1139620flI(long j, LiveEffect liveEffect, String str, String str2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = liveEffect;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        Long lValueOf;
        String str2 = str;
        if (str2.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("avatar onReady FAILED: ImageLoader.getImageFilePath empty, uid=");
            sbLIZ.append(this.LL);
            sbLIZ.append(", url=");
            sbLIZ.append(this.LLILLJJLI);
            C20441214yg.LJ("GameGiftStateManager__ttlive_gift_render", C2188811AlT.LIZIZ(sbLIZ));
        } else {
            LiveEffect liveEffect = this.LLILLL;
            long j = this.LL;
            String str3 = this.LLILZ;
            InterfaceC1268640j7O interfaceC1268640j7OLJ = C1137660fi8.LJ();
            if (interfaceC1268640j7OLJ != null && liveEffect != null) {
                try {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("avatar_");
                    sbLIZ2.append(j);
                    interfaceC1268640j7OLJ.setCustomEffect(C2188811AlT.LIZIZ(sbLIZ2), str2);
                    JSONObject jSONObjectPut = new JSONObject().put("user_id", String.valueOf(j));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("avatar_");
                    sbLIZ3.append(j);
                    JSONObject jSONObjectPut2 = jSONObjectPut.put("avatar_key", C2188811AlT.LIZIZ(sbLIZ3)).put("name", str3);
                    int iSendEffectMsg = interfaceC1268640j7OLJ.sendEffectMsg(57, 103, 0, C786410Ut5.J3(jSONObjectPut2));
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("sendMinuteGiftAvatarReady, result=");
                    sbLIZ4.append(iSendEffectMsg);
                    sbLIZ4.append(", effectId=");
                    sbLIZ4.append(liveEffect.getEffectId());
                    sbLIZ4.append(", userId=");
                    sbLIZ4.append(j);
                    sbLIZ4.append(", displayName=");
                    sbLIZ4.append(str3);
                    sbLIZ4.append(", payload=");
                    sbLIZ4.append(jSONObjectPut2);
                    C20441214yg.LJIIIZ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ4));
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } else {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("sendMinuteGiftAvatarReady fail, filterManager=");
                sbLIZ5.append(interfaceC1268640j7OLJ);
                sbLIZ5.append(", effectId=");
                String filePath = null;
                if (liveEffect != null) {
                    lValueOf = Long.valueOf(liveEffect.getEffectId());
                } else {
                    lValueOf = null;
                }
                sbLIZ5.append(lValueOf);
                sbLIZ5.append(", filePath=");
                if (liveEffect != null) {
                    filePath = liveEffect.getFilePath();
                }
                sbLIZ5.append(filePath);
                C20441214yg.LJ("StickerGiftEffectSDKHelper", C2188811AlT.LIZIZ(sbLIZ5));
            }
        }
        return Unit.LIZ;
    }
}
