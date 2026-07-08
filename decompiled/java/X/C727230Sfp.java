package X;

import java.util.List;

/* JADX INFO: renamed from: X.0Sfp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727230Sfp<SUBSCRIBE_DATA, OUTPUT_DATA> {
    public final List<InterfaceC2217241BqE<SUBSCRIBE_DATA, ?>> LIZ;
    public final SUBSCRIBE_DATA LIZIZ;
    public final OUTPUT_DATA LIZJ;
    public final InterfaceC2217241BqE<SUBSCRIBE_DATA, ?>[] LIZLLL;

    public static C727230Sfp LIZ(C727230Sfp c727230Sfp, InterfaceC2217241BqE[] interfaceC2217241BqEArr) {
        List<InterfaceC2217241BqE<SUBSCRIBE_DATA, ?>> list = c727230Sfp.LIZ;
        SUBSCRIBE_DATA subscribe_data = c727230Sfp.LIZIZ;
        OUTPUT_DATA output_data = c727230Sfp.LIZJ;
        c727230Sfp.getClass();
        return new C727230Sfp(list, subscribe_data, output_data, interfaceC2217241BqEArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C727230Sfp(List<? extends InterfaceC2217241BqE<SUBSCRIBE_DATA, ?>> list, SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data, InterfaceC2217241BqE<SUBSCRIBE_DATA, ?>[] interfaceC2217241BqEArr) {
        this.LIZ = list;
        this.LIZIZ = subscribe_data;
        this.LIZJ = output_data;
        this.LIZLLL = interfaceC2217241BqEArr;
    }
}
