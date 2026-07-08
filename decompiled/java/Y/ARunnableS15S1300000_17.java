package Y;

import X.AbstractC1093440eYo;
import X.C0VMV;
import X.C1093230eYT;
import X.C1093280eYY;
import X.C1093340eYe;
import X.C1093420eYm;
import X.C1143680frq;
import X.C118300cf;
import X.C123100dR;
import X.C1C7U;
import X.C2176521AGc;
import X.C2188811AlT;
import X.C227400uG;
import X.C416770GVv;
import X.C418440Gaw;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1093260eYW;
import X.InterfaceC1093320eYc;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.text.a0;
import webcast.api.room.StrategyTriggerEvent;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS15S1300000_17 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C416770GVv c416770GVv;
        Drawable drawableLIZ = C1143680frq.LIZ("tiktok_live_broadcast_demand_5", "ttlive_coin_icon.png");
        if (!TextUtils.isEmpty(this.s0)) {
            ((C118300cf) this.l1).element = a0.LJJIZ((SpannableStringBuilder) this.l2, (char) 65532, 0, false, 6);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18));
            if (((C118300cf) this.l1).element != -1) {
                if (drawableLIZ != null) {
                    drawableLIZ.setBounds(iLIZIZ, iLIZIZ, iLIZIZ2, iLIZIZ2);
                }
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.l2;
                if (drawableLIZ != null) {
                    c416770GVv = new C416770GVv(drawableLIZ);
                    c416770GVv.LIZIZ(0.0f);
                    c416770GVv.LLILZ = iLIZIZ;
                    c416770GVv.LLILLL = iLIZIZ;
                    c416770GVv.LL = iLIZIZ;
                    c416770GVv.LLILLJJLI = iLIZIZ;
                } else {
                    c416770GVv = null;
                }
                int i = ((C118300cf) this.l1).element;
                C786410Ut5.q2(spannableStringBuilder, c416770GVv, i, i + 1, 17);
            }
        }
        C500260Jjc.LJJLIIIJJIZ(new AwS418S0200000_17((C2176521AGc) this.l3, (SpannableStringBuilder) this.l2, 70));
    }

    public final void LIZ$1() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildStreamEvents engine=");
        sbLIZ.append(((AbstractC1093440eYo) this.l1).getClass().getSimpleName());
        sbLIZ.append(", triggerCount=");
        List list = (List) this.l2;
        sbLIZ.append(list != null ? list.size() : 0);
        sbLIZ.append(", tickerEventName=");
        sbLIZ.append(this.s0);
        sbLIZ.append(", tickerInterval=");
        sbLIZ.append((Long) this.l3);
        C227400uG.LIZ("LiveTTMEventStreamManager", C2188811AlT.LIZIZ(sbLIZ));
        List<StrategyTriggerEvent> list2 = (List) this.l2;
        if (list2 != null) {
            AbstractC1093440eYo abstractC1093440eYo = (AbstractC1093440eYo) this.l1;
            String str = this.s0;
            Long l = (Long) this.l3;
            C0VMV c0vmv = C1093420eYm.LIZIZ;
            c0vmv.getClass();
            ArrayList arrayList = new ArrayList();
            for (final StrategyTriggerEvent strategyTriggerEvent : list2) {
                int i = strategyTriggerEvent.eventType;
                if (i == EnumC1093260eYW.CUSTOM.getType()) {
                    arrayList.add(new InterfaceC1093320eYc(strategyTriggerEvent) { // from class: X.0eYV
                        public final StrategyTriggerEvent LIZ;
                        public boolean LIZIZ = false;

                        @Override // X.InterfaceC1093320eYc
                        public final void stop() {
                            this.LIZIZ = true;
                        }

                        @Override // X.InterfaceC1093320eYc
                        public final EnumC1093260eYW LIZ() {
                            return EnumC1093260eYW.CUSTOM;
                        }

                        @Override // X.InterfaceC1093320eYc
                        public final boolean isFrozen() {
                            return this.LIZIZ;
                        }

                        {
                            this.LIZ = strategyTriggerEvent;
                        }

                        @Override // X.InterfaceC1093320eYc
                        public final boolean LIZIZ(C473440IhS c473440IhS) {
                            if (this.LIZ.values.contains(c473440IhS.LJ) && C1093310eYb.LIZ(this, c473440IhS)) {
                                return true;
                            }
                            return false;
                        }
                    });
                } else if (i == EnumC1093260eYW.APPLOG.getType()) {
                    arrayList.add(new C1093280eYY(strategyTriggerEvent));
                } else if (i == EnumC1093260eYW.FEATURE.getType()) {
                    arrayList.add(new C1093230eYT(strategyTriggerEvent));
                } else if (i == EnumC1093260eYW.SERVER.getType()) {
                    arrayList.add(new InterfaceC1093320eYc(strategyTriggerEvent) { // from class: X.0eYa
                        public final StrategyTriggerEvent LIZ;
                        public boolean LIZIZ = false;

                        @Override // X.InterfaceC1093320eYc
                        public final void stop() {
                            this.LIZIZ = true;
                        }

                        @Override // X.InterfaceC1093320eYc
                        public final EnumC1093260eYW LIZ() {
                            return EnumC1093260eYW.SERVER;
                        }

                        @Override // X.InterfaceC1093320eYc
                        public final boolean isFrozen() {
                            return this.LIZIZ;
                        }

                        {
                            this.LIZ = strategyTriggerEvent;
                        }

                        @Override // X.InterfaceC1093320eYc
                        public final boolean LIZIZ(C473440IhS c473440IhS) {
                            if (!this.LIZIZ && c473440IhS.LIZIZ == EnumC1093260eYW.SERVER && this.LIZ.values.contains(c473440IhS.LJ)) {
                                return true;
                            }
                            return false;
                        }
                    });
                }
                if (C123100dR.LIZ(str)) {
                    arrayList.add(new C1093340eYe(str, l));
                }
            }
            c0vmv.LIZIZ.put(abstractC1093440eYo, arrayList);
        }
    }

    public static final void run$0(ARunnableS15S1300000_17 aRunnableS15S1300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GrowthTaskTitleViewHolder@cca7.onBind$2");
        try {
            aRunnableS15S1300000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GrowthTaskTitleViewHolder@cca7.onBind$2");
    }

    public static final void run$1(ARunnableS15S1300000_17 aRunnableS15S1300000_17) {
        boolean zLIZ;
        C1C7U.LIZ("LiveTTMEventStreamManager@ad4d.buildStreamEvents$1");
        try {
            aRunnableS15S1300000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveTTMEventStreamManager@ad4d.buildStreamEvents$1");
    }

    public ARunnableS15S1300000_17(String str, Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
    }
}
