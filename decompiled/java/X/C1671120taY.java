package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0taY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1671120taY extends C09AY implements InterfaceC1631620sYq<InterfaceC1669590tY5, InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ AbstractC1690640u62 LLILLJJLI;
    public final /* synthetic */ C13EY<Integer, C1690050u55> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Set<Integer> LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ InterfaceC1690500u5o LLJI;
    public final /* synthetic */ SocialMediaPickerViewModel LLJIJIL;
    public final /* synthetic */ C1690080u58 LLJILJIL;
    public final /* synthetic */ float LLJILJILJ;
    public final /* synthetic */ float LLJILLL;
    public final /* synthetic */ Function2<C1378605aS, SocMediaResource, Unit> LLJJ;
    public final /* synthetic */ float LLJJI;
    public final /* synthetic */ C05P1<Integer> LLJJIII;
    public final /* synthetic */ C05P1<C1690050u55> LLJJIJI;
    public final /* synthetic */ C05P1<Boolean> LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1671120taY(boolean z, AbstractC1690640u62 abstractC1690640u62, C13EY<Integer, C1690050u55> c13ey, boolean z2, boolean z3, int i, boolean z4, Set<Integer> set, long j, InterfaceC1690500u5o interfaceC1690500u5o, SocialMediaPickerViewModel socialMediaPickerViewModel, C1690080u58 c1690080u58, float f, float f2, Function2<? super C1378605aS, ? super SocMediaResource, Unit> function2, float f3, C05P1<Integer> c05p1, C05P1<C1690050u55> c05p12, C05P1<Boolean> c05p13) {
        super(3);
        this.LL = z;
        this.LLILLJJLI = abstractC1690640u62;
        this.LLILLL = c13ey;
        this.LLILZ = z2;
        this.LLILZIL = z3;
        this.LLILZLL = i;
        this.LLIZ = z4;
        this.LLIZLLLIL = set;
        this.LLJ = j;
        this.LLJI = interfaceC1690500u5o;
        this.LLJIJIL = socialMediaPickerViewModel;
        this.LLJILJIL = c1690080u58;
        this.LLJILJILJ = f;
        this.LLJILLL = f2;
        this.LLJJ = function2;
        this.LLJJI = f3;
        this.LLJJIII = c05p1;
        this.LLJJIJI = c05p12;
        this.LLJJIJIIJIL = c05p13;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(InterfaceC1669590tY5 interfaceC1669590tY5, InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 17) == 16 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C19719212De c19719212DeLIZJ = C13Z4.LIZJ(-144796545, new C1668960tX4(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLILZIL, this.LLILZ, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII), interfaceC1680500tpg2);
            boolean z = false;
            if (this.LL) {
                interfaceC1680500tpg2.LJJIIJZLJL(1540668516);
                C1690050u55 value = this.LLJJIJI.getValue();
                if (value != null && value.LIZIZ()) {
                    z = true;
                }
                boolean z2 = !z;
                AbstractC1690640u62 abstractC1690640u62 = this.LLILLJJLI;
                interfaceC1680500tpg2.LJJIIJZLJL(1849434622);
                Object objLJJ = interfaceC1680500tpg2.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                if (objLJJ == C1680510tph.LIZIZ) {
                    objLJJ = AnonymousClass0207.get$arr$(44);
                    interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg2.LJ();
                C1675550thh.LIZ(abstractC1690640u62, null, null, null, 1, 0.0f, null, null, z2, false, (Function1) objLJJ, null, null, null, C13Z4.LIZJ(-367816411, new C1671130taZ(this.LLILLL, c19719212DeLIZJ, this.LLILZ, this.LLILLJJLI, this.LLJJIJIIJIL), interfaceC1680500tpg2), interfaceC1680500tpg2, 24576, 24582, 15086);
                interfaceC1680500tpg2.LJ();
            } else {
                interfaceC1680500tpg2.LJJIIJZLJL(1541702583);
                C13EY<Integer, C1690050u55> c13ey = this.LLILLL;
                C1690050u55 c1690050u55 = c13ey.get(0);
                if (c1690050u55 == null) {
                    c1690050u55 = new C1690050u55(0, 0);
                    c13ey.put(0, c1690050u55);
                }
                if (!this.LLILZ && this.LLILZIL && !this.LLJJIJIIJIL.getValue().booleanValue()) {
                    z = true;
                }
                c19719212DeLIZJ.invoke(0, c1690050u55, Boolean.valueOf(z), interfaceC1680500tpg2, 3078);
                interfaceC1680500tpg2.LJ();
            }
        }
        return Unit.LIZ;
    }
}
