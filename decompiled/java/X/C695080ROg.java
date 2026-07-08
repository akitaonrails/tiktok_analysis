package X;

import X.C0ROM;
import X.C690870R8b;
import X.C698680Ras;
import X.C700170RdH;
import X.C701040Reg;
import X.EnumC696040RRy;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0ROg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C695080ROg implements InterfaceC695090ROh {
    public final /* synthetic */ C0ROM<VideoItemParams, C690870R8b> LL;
    public final /* synthetic */ ReusedUIAssem<?> LLILLJJLI;
    public final /* synthetic */ C690870R8b LLILLL;

    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC695090ROh> LJ() {
        List<C0ROM<VideoItemParams, C690870R8b>> listLJ = this.LL.LJ();
        ArrayList arrayList = new ArrayList();
        ReusedUIAssem<?> reusedUIAssem = this.LLILLJJLI;
        C690870R8b c690870R8b = this.LLILLL;
        Iterator<C0ROM<VideoItemParams, C690870R8b>> it2 = listLJ.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C695080ROg(it2.next(), reusedUIAssem, c690870R8b));
        }
        return arrayList;
    }

    @Override // X.InterfaceC695090ROh
    public final List<InterfaceC700010Rd1> LJII(C701040Reg c701040Reg) {
        InterfaceC700010Rd1 interfaceC700010Rd1LIZJ;
        ArrayList arrayList = new ArrayList();
        if (c701040Reg == null || (interfaceC700010Rd1LIZJ = c701040Reg.LIZJ(this.LL.LJI())) == null) {
            final C0ROM<VideoItemParams, C690870R8b> c0rom = this.LL;
            final ReusedUIAssem<?> reusedUIAssem = this.LLILLJJLI;
            final C690870R8b c690870R8b = this.LLILLL;
            interfaceC700010Rd1LIZJ = new InterfaceC700010Rd1() { // from class: com.ss.android.ugc.aweme.story.feed.immersive.component.competition.core.IUINodeBridgeKt$buildModifier$1
                @Override // X.InterfaceC700010Rd1
                public final boolean LIZ(C698680Ras c698680Ras, C700170RdH c700170RdH) {
                    return true;
                }

                @Override // X.InterfaceC700010Rd1
                public final void LIZLLL(boolean z, C701040Reg c701040Reg2) {
                }

                @Override // X.InterfaceC700010Rd1
                public final boolean LJ() {
                    return false;
                }

                @Override // X.InterfaceC700010Rd1
                public final void LJFF(C701040Reg c701040Reg2) {
                }

                @Override // X.InterfaceC700010Rd1
                public final FcpNodeProtocol LIZJ() {
                    final C0ROM<VideoItemParams, C690870R8b> c0rom2 = c0rom;
                    return new FcpNodeProtocol() { // from class: com.ss.android.ugc.aweme.story.feed.immersive.component.competition.core.IUINodeBridgeKt$buildModifier$1$nodeProtocol$1
                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final InterfaceC701260Rf2 vk() {
                            return null;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final InterfaceC700000Rd0 wb1() {
                            return null;
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final String H3() {
                            return c0rom2.LJI();
                        }

                        @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
                        public final String LLLII() {
                            return H3();
                        }
                    };
                }

                @Override // X.InterfaceC700010Rd1
                public final EnumC696040RRy getType() {
                    return EnumC696040RRy.CUSTOM;
                }

                @Override // X.InterfaceC700010Rd1
                public final boolean LIZIZ(C700170RdH c700170RdH) {
                    return c0rom.LIZ((VideoItemParams) reusedUIAssem.bo(), c690870R8b);
                }
            };
        }
        arrayList.add(interfaceC700010Rd1LIZJ);
        return C13LP.LJJJJLI(arrayList);
    }

    public C695080ROg(C0ROM<VideoItemParams, C690870R8b> c0rom, ReusedUIAssem<?> reusedUIAssem, C690870R8b c690870R8b) {
        this.LL = c0rom;
        this.LLILLJJLI = reusedUIAssem;
        this.LLILLL = c690870R8b;
    }
}
