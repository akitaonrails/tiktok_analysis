package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.socialavatar.api.ISocialAvatarStoryPostService;
import com.ss.android.ugc.aweme.socialavatar.model.SocialAvatarStickerStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0o9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462410o9v extends AbstractC2255721DQs<InterfaceC1462270o9h> implements InterfaceC1462270o9h, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public static final int LLILZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC391240FVq.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1462410o9v.class, "infiniStickerApi", "getInfiniStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/newengine/EditorInfiniStickerApi;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = 8;
    }

    public InterfaceC1462270o9h W1() {
        return this;
    }

    private final InterfaceC391240FVq X1() {
        return (InterfaceC391240FVq) this.LLILLJJLI.getValue(this, LLILLL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1462410o9v(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.InterfaceC1462270o9h
    public void W91(Effect effect) {
        ConcurrentHashMap<String, Object> concurrentHashMapLIZ;
        String str;
        ISocialAvatarStoryPostService iSocialAvatarStoryPostService;
        SocialAvatarStickerStruct socialAvatarStickerStructLIZIZ;
        String extra = effect.getExtra();
        if (extra != null && extra.length() != 0 && (concurrentHashMapLIZ = C178100mJ.LIZ(effect.getExtra())) != null) {
            Object obj = concurrentHashMapLIZ.get("expression");
            if ((obj instanceof String) && (str = (String) obj) != null && (iSocialAvatarStoryPostService = (ISocialAvatarStoryPostService) PluggableExtentionKt.pluggableSpi$default(ISocialAvatarStoryPostService.class, false, false, false, 14, null)) != null && (socialAvatarStickerStructLIZIZ = iSocialAvatarStoryPostService.LIZIZ(str)) != null) {
                InterfaceC391240FVq interfaceC391240FVqX1 = X1();
                if (interfaceC391240FVqX1 != null) {
                    interfaceC391240FVqX1.f3(C19599011m8.LIZ(socialAvatarStickerStructLIZIZ), EnumC356070Dxd.COMMIT);
                }
                IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJJIJIIJI(str);
            }
        }
    }
}
