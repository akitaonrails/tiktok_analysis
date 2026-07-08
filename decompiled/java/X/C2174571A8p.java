package X;

import android.content.Context;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.OfflineVideosVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class C2174571A8p extends C2217421BqW implements Function1<InterfaceC1872207Uy, Unit> {
    public C2174571A8p(Object obj) {
        super(1, obj, OfflineVideosVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/cache/cell/OfflineVideosCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1872207Uy interfaceC1872207Uy) {
        InterfaceC1872207Uy interfaceC1872207Uy2 = interfaceC1872207Uy;
        this.receiver.getClass();
        if (interfaceC1872207Uy2 instanceof C1872107Ux) {
            Context context = ((C1872107Ux) interfaceC1872207Uy2).LIZ;
            C19328810je.LIZ(EnumC2174521A8k.OFFLINE_VIDEOS.getKey());
            C1EE1.LIZIZ.LJJJJIZL(context, "click_icon", "settings_and_privacy", false, EnumC616320OFi.OFFLINE_MODE_PANEL);
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
