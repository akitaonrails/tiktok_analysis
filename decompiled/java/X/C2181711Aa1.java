package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1Aa1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181711Aa1 implements InterfaceC2182021AaW {
    public final String LIZ;
    public final InterfaceC1631620sYq<Long, C1AZ9, List<C2181251AYh>, Unit> LIZIZ;
    public final long LIZJ = System.currentTimeMillis();

    @Override // X.InterfaceC2182261Aau
    public final String LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC2182261Aau
    public final long getTaskId() {
        return this.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2181711Aa1(String str, InterfaceC1631620sYq<? super Long, ? super C1AZ9, ? super List<C2181251AYh>, Unit> interfaceC1631620sYq) {
        this.LIZ = str;
        this.LIZIZ = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC2182021AaW
    public final void LIZIZ(C1AZ9 c1az9, List<C2181251AYh> list) {
        this.LIZIZ.invoke(Long.valueOf(this.LIZJ), c1az9, list);
    }
}
