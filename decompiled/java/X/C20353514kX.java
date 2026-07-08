package X;

import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.playentity.StickerEffectEntity;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20353514kX extends C09AY implements Function1<List<? extends LiveEffect>, Unit> {
    public final /* synthetic */ StickerEffectEntity LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<String, String, List<String>, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20353514kX(StickerEffectEntity stickerEffectEntity, String str, String str2, InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit> interfaceC1631620sYq) {
        super(1);
        this.LL = stickerEffectEntity;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = interfaceC1631620sYq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends LiveEffect> list) {
        String resourceId;
        List<String> list2;
        UrlModel icon;
        StickerEffectEntity stickerEffectEntity = this.LL;
        String str = this.LLILLJJLI;
        String str2 = this.LLILLL;
        stickerEffectEntity.getClass();
        stickerEffectEntity.LLJJJJLIIL = StickerEffectEntity.LJJLIIIJILLIZJL(str, str2, list);
        String str3 = this.LL.LLJJJJJIL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uiEffectResourceId=");
        LiveEffect liveEffect = this.LL.LLJJJJLIIL;
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        } else {
            resourceId = null;
        }
        sbLIZ.append(resourceId);
        C20441214yg.LJIIIZ(str3, C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1631620sYq<String, String, List<String>, Unit> interfaceC1631620sYq = this.LLILZ;
        String str4 = this.LLILLJJLI;
        String str5 = this.LLILLL;
        LiveEffect liveEffect2 = this.LL.LLJJJJLIIL;
        if (liveEffect2 == null || (icon = liveEffect2.getIcon()) == null || (list2 = icon.urlList) == null) {
            list2 = C13BV.INSTANCE;
        }
        interfaceC1631620sYq.invoke(str4, str5, list2);
        return Unit.LIZ;
    }
}
