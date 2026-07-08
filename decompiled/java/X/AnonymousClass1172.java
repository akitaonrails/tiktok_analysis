package X;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.legacy.network.viewmodel.SuggestWordsViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.1172, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1172 implements C117D {
    public final C194483116z LIZ;
    public boolean LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C01GW LJFF;
    public final C01GW LJI;

    @Override // X.C117D
    public final void onCreate() {
    }

    @Override // X.C117D
    public final void onDestroy() {
    }

    @Override // X.C117D
    public final void LJFF() {
        SuggestWordsViewModel suggestWordsViewModel;
        if (this.LIZIZ && (suggestWordsViewModel = (SuggestWordsViewModel) this.LIZLLL.getValue()) != null) {
            suggestWordsViewModel.vQ2((C0QRA) this.LJ.getValue(), new AnonymousClass1171(this));
        }
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LIZIZ = true;
        }
    }

    public final AnonymousClass1173 LJI() {
        return (AnonymousClass1173) this.LJFF.getValue();
    }

    @Override // X.C117D
    public final void LIZ() {
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LJI();
        }
    }

    @Override // X.C117D
    public final void LIZIZ() {
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LJFF();
        }
    }

    @Override // X.C117D
    public final void LIZJ() {
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LJ();
        }
    }

    @Override // X.C117D
    public final void LIZLLL() {
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LIZLLL();
        }
    }

    @Override // X.C117D
    public final void LJ() {
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LIZJ();
        }
    }

    @Override // X.C117D
    public final void onPause() {
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LIZIZ = false;
        }
    }

    @Override // X.C117D
    public final void onResume() {
        AnonymousClass1173 anonymousClass1173LJI = LJI();
        if (anonymousClass1173LJI != null) {
            anonymousClass1173LJI.LIZIZ = true;
        }
    }

    public AnonymousClass1172(C194483116z c194483116z) {
        this.LIZ = c194483116z;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1077));
        this.LIZJ = c01gwLIZIZ;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1235));
        this.LIZLLL = c01gwLIZIZ2;
        C01GW c01gwLIZIZ3 = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(669));
        this.LJ = c01gwLIZIZ3;
        this.LJFF = C452501pT.LIZIZ(new AwS573S0100000_29(this, 1078));
        C01GW c01gwLIZIZ4 = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(447));
        this.LJI = c01gwLIZIZ4;
        C19FO c19fo = (C19FO) c01gwLIZIZ.getValue();
        if (c19fo != null) {
            ((C117C) c01gwLIZIZ4.getValue()).LIZJ(new WeakReference<>(c19fo));
            ((ArrayList) ((C117C) c01gwLIZIZ4.getValue()).LIZ).add(this);
            AnonymousClass1173 anonymousClass1173LJI = LJI();
            if (anonymousClass1173LJI != null) {
                anonymousClass1173LJI.LIZIZ = true;
            }
            SuggestWordsViewModel suggestWordsViewModel = (SuggestWordsViewModel) c01gwLIZIZ2.getValue();
            if (suggestWordsViewModel != null) {
                ((LiveData) suggestWordsViewModel.LL.getValue()).observe(c19fo, new Observer<C0QRC<TypeWords>>() { // from class: X.1174
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(C0QRC<TypeWords> c0qrc) {
                        C0QRC<TypeWords> c0qrc2 = c0qrc;
                        AnonymousClass1173 anonymousClass1173LJI2 = this.LL.LJI();
                        if (anonymousClass1173LJI2 != null) {
                            anonymousClass1173LJI2.LIZIZ(c0qrc2);
                        }
                    }
                });
                suggestWordsViewModel.vQ2((C0QRA) c01gwLIZIZ3.getValue(), new AnonymousClass1171(this));
            }
        }
    }
}
