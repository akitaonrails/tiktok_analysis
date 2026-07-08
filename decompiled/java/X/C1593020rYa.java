package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rYa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593020rYa extends C1584440rKk {
    public final C1592290rXP LIZLLL;
    public final EnumC1571190qzN LJ;
    public final EnumC1593030rYb LJFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1593020rYa(Context context, String str, String str2, C1592290rXP c1592290rXP) {
        EnumC1593030rYb enumC1593030rYb;
        super(context, str, str2);
        EnumC1571190qzN enumC1571190qzN = EnumC1571190qzN.DARK;
        if (Intrinsics.LJFF(str, "HOME")) {
            enumC1593030rYb = EnumC1593030rYb.SELECT;
        } else {
            enumC1593030rYb = EnumC1593030rYb.UNSELECT;
        }
        this.LIZLLL = c1592290rXP;
        this.LJ = enumC1571190qzN;
        this.LJFF = enumC1593030rYb;
    }
}
