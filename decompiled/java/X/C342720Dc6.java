package X;

import androidx.compose.ui.platform.ComposeView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.aime.IAIMEServices;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC20647615qs("sa_aiself_compatibility_sheet")
public final class C342720Dc6 extends AbstractC20659615so<TuxSheet> {
    public final C19EG LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;
    public final Function0<Unit> LLILZIL;
    public final int LLILZLL = 1;
    public final C01GW LLIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(6097));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 552));

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        C0HYP.LIZ.getClass();
        C0HYP.LJ().storeBoolean("has_shown_aiself_compatibility_popup", true);
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZLL;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0Dc9] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0Dc9] */
    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        ComposeView composeViewLJIIIIZZ;
        final String str = this.LLILLL;
        final boolean z = false;
        final boolean z2 = true;
        final ?? r6 = new Object(str, z, z2) { // from class: X.0Dc9
            public final String LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C342750Dc9)) {
                    return false;
                }
                C342750Dc9 c342750Dc9 = (C342750Dc9) obj;
                return Intrinsics.LJFF(this.LIZ, c342750Dc9.LIZ) && this.LIZIZ == c342750Dc9.LIZIZ && this.LIZJ == c342750Dc9.LIZJ;
            }

            {
                this.LIZ = str;
                this.LIZIZ = z;
                this.LIZJ = z2;
            }
        };
        final String str2 = this.LLILLJJLI;
        final ?? r7 = new Object(str2, z2, z) { // from class: X.0Dc9
            public final String LIZ;
            public final boolean LIZIZ;
            public final boolean LIZJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C342750Dc9)) {
                    return false;
                }
                C342750Dc9 c342750Dc9 = (C342750Dc9) obj;
                return Intrinsics.LJFF(this.LIZ, c342750Dc9.LIZ) && this.LIZIZ == c342750Dc9.LIZIZ && this.LIZJ == c342750Dc9.LIZJ;
            }

            {
                this.LIZ = str2;
                this.LIZIZ = z2;
                this.LIZJ = z;
            }
        };
        final String string = this.LL.getString(2131847311);
        final String string2 = this.LL.getString(2131847310);
        final String string3 = this.LL.getString(2131847309);
        final AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(this, 548);
        final String string4 = this.LL.getString(2131847312);
        final AwS548S0100000_4 awS548S0100000_42 = new AwS548S0100000_4(this, 549);
        final AwS548S0100000_4 awS548S0100000_43 = new AwS548S0100000_4(this, 550);
        final AwS548S0100000_4 awS548S0100000_44 = new AwS548S0100000_4(this, 551);
        InterfaceC342760DcA interfaceC342760DcA = new InterfaceC342760DcA(r6, r7, string, string2, string3, awS548S0100000_4, string4, awS548S0100000_42, awS548S0100000_43, awS548S0100000_44) { // from class: X.0Dc7
            public final C342750Dc9 LIZ;
            public final C342750Dc9 LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final Function0<Unit> LJFF;
            public final String LJI;
            public final Function0<Unit> LJII;
            public final Function0<Unit> LJIIIIZZ;
            public final Function0<Unit> LJIIIZ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C342730Dc7)) {
                    return false;
                }
                C342730Dc7 c342730Dc7 = (C342730Dc7) obj;
                return Intrinsics.LJFF(this.LIZ, c342730Dc7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c342730Dc7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c342730Dc7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c342730Dc7.LIZLLL) && Intrinsics.LJFF(this.LJ, c342730Dc7.LJ) && Intrinsics.LJFF(this.LJFF, c342730Dc7.LJFF) && Intrinsics.LJFF(this.LJI, c342730Dc7.LJI) && Intrinsics.LJFF(this.LJII, c342730Dc7.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c342730Dc7.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c342730Dc7.LJIIIZ);
            }

            public final int hashCode() {
                C342750Dc9 c342750Dc9 = this.LIZ;
                int iHashCode = (c342750Dc9 == null ? 0 : c342750Dc9.hashCode()) * 31;
                C342750Dc9 c342750Dc92 = this.LIZIZ;
                return ((((((((((((((((iHashCode + (c342750Dc92 != null ? c342750Dc92.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SocialAvatarCompatibleTaskDialog(mainTaskImage=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", sideTaskImage=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", title=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", content=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(", mainButtonTitle=");
                sbLIZ.append(this.LJ);
                sbLIZ.append(", mainButtonAction=");
                sbLIZ.append(this.LJFF);
                sbLIZ.append(", deleteTitle=");
                sbLIZ.append(this.LJI);
                sbLIZ.append(", deleteAction=");
                sbLIZ.append(this.LJII);
                sbLIZ.append(", dialogCloseActionTrigger=");
                sbLIZ.append(this.LJIIIIZZ);
                sbLIZ.append(", showAction=");
                sbLIZ.append(this.LJIIIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC342760DcA
            public final Function0<Unit> LIZ() {
                return this.LJII;
            }

            @Override // X.InterfaceC342760DcA
            public final String LIZIZ() {
                return this.LJ;
            }

            @Override // X.InterfaceC342760DcA
            public final Function0<Unit> LIZJ() {
                return this.LJIIIIZZ;
            }

            @Override // X.InterfaceC342760DcA
            public final String LIZLLL() {
                return this.LJI;
            }

            @Override // X.InterfaceC342760DcA
            public final Function0<Unit> LJ() {
                return this.LJFF;
            }

            @Override // X.InterfaceC342760DcA
            public final Function0<Unit> LJFF() {
                return this.LJIIIZ;
            }

            @Override // X.InterfaceC342760DcA
            public final C342750Dc9 LJI() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC342760DcA
            public final C342750Dc9 LJII() {
                return this.LIZ;
            }

            @Override // X.InterfaceC342760DcA
            public final String getContent() {
                return this.LIZLLL;
            }

            @Override // X.InterfaceC342760DcA
            public final String getTitle() {
                return this.LIZJ;
            }

            {
                this.LIZ = r6;
                this.LIZIZ = r7;
                this.LIZJ = string;
                this.LIZLLL = string2;
                this.LJ = string3;
                this.LJFF = awS548S0100000_4;
                this.LJI = string4;
                this.LJII = awS548S0100000_42;
                this.LJIIIIZZ = awS548S0100000_43;
                this.LJIIIZ = awS548S0100000_44;
            }
        };
        IAIMEServices iAIMEServices = (IAIMEServices) this.LLIZ.getValue();
        if (iAIMEServices == null || (composeViewLJIIIIZZ = iAIMEServices.LJIIIIZZ(interfaceC342760DcA, c688120Qyw.LIZ)) == null) {
            return null;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = composeViewLJIIIIZZ;
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        return tuxSheet;
    }

    public C342720Dc6(C19EG c19eg, String str, String str2, String str3, AwS407S0200000_6 awS407S0200000_6) {
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = awS407S0200000_6;
    }
}
