package X;

import java.util.Deque;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.1Bnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215801Bnu {
    public static final C2215851Bnz LIZIZ = new C2215851Bnz(EnumC2215821Bnw.LEFT_BRACKET, e3.h);
    public final Deque<C2215851Bnz> LIZ = new LinkedList();

    public final void LIZ() {
        int i = 0;
        while (i < ((LinkedList) this.LIZ).size() - 1) {
            C2215851Bnz c2215851Bnz = (C2215851Bnz) C13LP.LJJJJJL(this.LIZ, i);
            i++;
            C2215851Bnz c2215851Bnz2 = (C2215851Bnz) C13LP.LJJJJJL(this.LIZ, i);
            if (Intrinsics.LJFF(c2215851Bnz2, LIZIZ) || !c2215851Bnz.LIZ() || c2215851Bnz2.LIZ()) {
                return;
            } else {
                c2215851Bnz2.LIZLLL = (C2215851Bnz) ((LinkedList) this.LIZ).pop();
            }
        }
    }

    public final void LIZIZ(C2215851Bnz c2215851Bnz) {
        if (!this.LIZ.isEmpty()) {
            C2215851Bnz c2215851Bnz2 = (C2215851Bnz) ((LinkedList) this.LIZ).pop();
            if (c2215851Bnz2.LIZ()) {
                c2215851Bnz.LIZJ = c2215851Bnz2;
                ((LinkedList) this.LIZ).push(c2215851Bnz);
                return;
            }
            throw new C2215701Bnk("express parse failed, retire not full node", null);
        }
        throw new C2215701Bnk("express parse failed, retire null node", null);
    }
}
