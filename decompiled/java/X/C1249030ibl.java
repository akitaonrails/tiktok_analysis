package X;

import Y.ARunnableS27S0400000_19;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ibl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249030ibl extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ProfileRootBaseComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249030ibl(ProfileRootBaseComponent profileRootBaseComponent) {
        super(1);
        this.LL = profileRootBaseComponent;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        Collection collectionValues = ((LinkedHashMap) this.LL.LLIZLLLIL).values();
        ProfileRootBaseComponent profileRootBaseComponent = this.LL;
        int i = 0;
        for (Object obj : collectionValues) {
            int i2 = i + 1;
            if (i >= 0) {
                C1248930ibb c1248930ibb = (C1248930ibb) obj;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("constructComponentTree add component: ");
                sbLIZ.append(c1248930ibb.LIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                EnumC1253850ijX enumC1253850ijX = EnumC1253850ijX.BUSINESS;
                C1248210iaR.LJ("BaseContainerComponent", strLIZIZ, enumC1253850ijX, "AddComponent");
                ProfileComponents profileComponentsAp = profileRootBaseComponent.ap(c1248930ibb.LIZ);
                C1251390ifZ c1251390ifZ = C1251390ifZ.LIZ;
                boolean z = profileRootBaseComponent.LLJILLL;
                c1251390ifZ.getClass();
                if (C1251390ifZ.LIZIZ(z) && Intrinsics.LJFF(c1248930ibb.LIZ, "profile_background") && profileComponentsAp == null) {
                    C1248210iaR.LJ("BaseContainerComponent", "constructComponentTree skip background because component data is empty", enumC1253850ijX, "SkipBackground");
                } else {
                    ARunnableS27S0400000_19 aRunnableS27S0400000_19 = new ARunnableS27S0400000_19(assembler2, profileRootBaseComponent, profileComponentsAp, c1248930ibb, 6);
                    if (c1248930ibb.LJ) {
                        C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, aRunnableS27S0400000_19);
                    } else {
                        aRunnableS27S0400000_19.run();
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LL.LLJJIJIL = true;
        return Unit.LIZ;
    }
}
