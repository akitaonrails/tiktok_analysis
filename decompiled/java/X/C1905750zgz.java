package X;

import com.ss.android.ugc.aweme.bubble.HomeTabBubbleServiceImpl;
import com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService;

/* JADX INFO: renamed from: X.0zgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905750zgz implements IHomeTabBubbleService {
    public static final C1905750zgz LIZIZ = new C1905750zgz();
    public final /* synthetic */ IHomeTabBubbleService LIZ;

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZ(String str, EnumC1584360rKc enumC1584360rKc) {
        this.LIZ.LIZ(str, enumC1584360rKc);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZIZ(String str, EnumC1584360rKc enumC1584360rKc) {
        this.LIZ.LIZIZ(str, enumC1584360rKc);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZJ(EnumC1584360rKc enumC1584360rKc) {
        this.LIZ.LIZJ(enumC1584360rKc);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LIZLLL(String str, EnumC1905820zh6 enumC1905820zh6) {
        this.LIZ.LIZLLL(str, enumC1905820zh6);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final InterfaceC1619130sEh LJ(C1906460zi8 c1906460zi8) {
        return this.LIZ.LJ(c1906460zi8);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final InterfaceC1619130sEh LJFF(C1906460zi8 c1906460zi8, InterfaceC1906540ziG interfaceC1906540ziG) {
        return this.LIZ.LJFF(c1906460zi8, interfaceC1906540ziG);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJI(EnumC1584360rKc enumC1584360rKc, EnumC1905820zh6 enumC1905820zh6) {
        this.LIZ.LJI(enumC1584360rKc, enumC1905820zh6);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJII(EnumC1584360rKc enumC1584360rKc, EnumC1905830zh7 enumC1905830zh7) {
        this.LIZ.LJII(enumC1584360rKc, enumC1905830zh7);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJIIIIZZ(C1906460zi8 c1906460zi8) {
        this.LIZ.LJIIIIZZ(c1906460zi8);
    }

    @Override // com.ss.android.ugc.aweme.bubble.IHomeTabBubbleService
    public final void LJIIIZ(Object obj, String str) {
        this.LIZ.LJIIIZ(obj, str);
    }

    public C1905750zgz() {
        IHomeTabBubbleService iHomeTabBubbleService;
        Object objLIZ = C04TD.LIZ(IHomeTabBubbleService.class, false);
        if (objLIZ != null) {
            iHomeTabBubbleService = (IHomeTabBubbleService) objLIZ;
        } else {
            if (C04TD.LLILZ == null) {
                synchronized (IHomeTabBubbleService.class) {
                    if (C04TD.LLILZ == null) {
                        C04TD.LLILZ = new HomeTabBubbleServiceImpl();
                    }
                }
            }
            iHomeTabBubbleService = C04TD.LLILZ;
        }
        this.LIZ = iHomeTabBubbleService;
    }
}
