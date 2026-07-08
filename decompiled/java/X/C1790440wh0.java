package X;

import com.ss.android.ugc.aweme.experiment.FcpTooltipConfig;
import com.ss.android.ugc.aweme.experiment.TooltipEntityConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0wh0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790440wh0 extends C09AY implements Function0<List<? extends InterfaceC1790610whH>> {
    public C1790440wh0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<? extends InterfaceC1790610whH> invoke() {
        return C1697810uHb.LJIIJJI(new InterfaceC1790610whH() { // from class: X.0wh3
            public final int LIZ;
            public final String LIZIZ;
            public final EnumC1790480wh4 LIZJ;

            @Override // X.InterfaceC1790610whH
            public final boolean LIZJ(C1906460zi8 c1906460zi8) {
                return false;
            }

            @Override // X.InterfaceC1790610whH
            public final boolean LIZLLL(String str) {
                return false;
            }

            {
                EnumC1790480wh4 enumC1790480wh4 = EnumC1790480wh4.OTHER_SHOWING;
                String type = enumC1790480wh4.getType();
                this.LIZ = 0;
                this.LIZIZ = type;
                this.LIZJ = enumC1790480wh4;
            }

            @Override // X.InterfaceC1790610whH
            public final EnumC1790480wh4 LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1790610whH
            public final int getPriority() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1790610whH
            public final String getRuleId() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1790610whH
            public final boolean LIZIZ(C1906460zi8 c1906460zi8) {
                String str;
                C1906460zi8 c1906460zi8LIZ = C1906360zhy.LIZ();
                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(c1906460zi8.LIZ);
                sbLIZ.append("] ruleType: ");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(" showing: ");
                if (c1906460zi8LIZ != null) {
                    str = c1906460zi8LIZ.LIZ;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                c1586120rNS.getClass();
                if (c1906460zi8LIZ != null) {
                    return true;
                }
                return false;
            }
        }, new InterfaceC1790610whH() { // from class: X.0wh2
            public final int LIZ;
            public final String LIZIZ;
            public final EnumC1790480wh4 LIZJ;
            public final List<String> LIZLLL;

            @Override // X.InterfaceC1790610whH
            public final boolean LIZJ(C1906460zi8 c1906460zi8) {
                return false;
            }

            @Override // X.InterfaceC1790610whH
            public final boolean LIZLLL(String str) {
                return false;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List<java.lang.String>] */
            /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List<java.lang.String>] */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
            {
                ?? arrayList;
                List<TooltipEntityConfig> list;
                EnumC1790480wh4 enumC1790480wh4 = EnumC1790480wh4.FCP_REGISTER;
                String type = enumC1790480wh4.getType();
                this.LIZ = 1;
                this.LIZIZ = type;
                this.LIZJ = enumC1790480wh4;
                List<String> list2 = C1904970zfj.LIZ;
                FcpTooltipConfig fcpTooltipConfig = (FcpTooltipConfig) C295110BhV.LIZ.getValue();
                if (fcpTooltipConfig == null || (list = fcpTooltipConfig.tooltipEntityConfigs) == null) {
                    arrayList = C1904970zfj.LIZ;
                } else {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<TooltipEntityConfig> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().id);
                    }
                }
                this.LIZLLL = arrayList;
            }

            @Override // X.InterfaceC1790610whH
            public final EnumC1790480wh4 LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1790610whH
            public final int getPriority() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1790610whH
            public final String getRuleId() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1790610whH
            public final boolean LIZIZ(C1906460zi8 c1906460zi8) {
                return !this.LIZLLL.contains(c1906460zi8.LIZ);
            }
        }, new InterfaceC1790610whH() { // from class: X.0rLm
            public final int LIZ;
            public final String LIZIZ;
            public final EnumC1790480wh4 LIZJ;

            @Override // X.InterfaceC1790610whH
            public final boolean LIZJ(C1906460zi8 c1906460zi8) {
                return false;
            }

            @Override // X.InterfaceC1790610whH
            public final boolean LIZLLL(String str) {
                return false;
            }

            {
                EnumC1790480wh4 enumC1790480wh4 = EnumC1790480wh4.NO_ANCHOR_TAB;
                String type = enumC1790480wh4.getType();
                this.LIZ = 2;
                this.LIZIZ = type;
                this.LIZJ = enumC1790480wh4;
            }

            @Override // X.InterfaceC1790610whH
            public final EnumC1790480wh4 LIZ() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1790610whH
            public final int getPriority() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1790610whH
            public final String getRuleId() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1790610whH
            public final boolean LIZIZ(C1906460zi8 c1906460zi8) {
                EnumC1584360rKc enumC1584360rKc = c1906460zi8.LIZIZ;
                boolean z = false;
                if (C13LQ.LJIILLIIL(EnumC592410NLj.TOP_ICON, enumC1584360rKc.getPos())) {
                    return false;
                }
                C1585070rLl.LIZ.getClass();
                if (C1585070rLl.LJIIJJI(enumC1584360rKc) || C1585070rLl.LJII(enumC1584360rKc)) {
                    z = true;
                }
                return !z;
            }
        });
    }
}
