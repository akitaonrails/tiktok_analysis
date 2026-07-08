package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.cell.LocalLiveWallpaperVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.07gy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1928607gy extends C2217421BqW implements Function1<InterfaceC1872007Uw, Unit> {
    public C1928607gy(Object obj) {
        super(1, obj, LocalLiveWallpaperVM.class, "processEvent", "processEvent(Lcom/ss/android/ugc/aweme/setting/ui/rvmpcompose/group/cache/cell/LocalLiveWallpaperCellEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1872007Uw interfaceC1872007Uw) {
        InterfaceC1872007Uw interfaceC1872007Uw2 = interfaceC1872007Uw;
        LocalLiveWallpaperVM localLiveWallpaperVM = (LocalLiveWallpaperVM) this.receiver;
        localLiveWallpaperVM.getClass();
        if (interfaceC1872007Uw2 instanceof C1871907Uv) {
            localLiveWallpaperVM.vQ2(((C1871907Uv) interfaceC1872007Uw2).LIZ, "settings_page");
            return Unit.LIZ;
        }
        throw new C1954807lC();
    }
}
