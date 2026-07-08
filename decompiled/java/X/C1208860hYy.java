package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.favorites.business.collection.collaborative.EditCollectionFragment;
import com.ss.android.ugc.aweme.mix.addfeed.DefaultMixListCell;
import com.ss.android.ugc.aweme.mix.editname.EditPlayListNameAssem;
import com.ss.android.ugc.aweme.poi.claim.view.IPoiClaimListAssemAbility;
import com.ss.android.ugc.aweme.poi.claim.view.PoiClaimSearchAssem;
import com.ss.android.ugc.aweme.poi.creator.PoiCreatorSearchAssem;
import com.ss.android.ugc.aweme.poi.search.assem.PoiSearchHeaderAssem;
import com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0hYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208860hYy implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$1(C1208860hYy c1208860hYy, Editable editable) {
    }

    public static final void beforeTextChanged$0(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$7(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$8(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$3(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$5(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$8(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
            case 7:
                afterTextChanged$7(this, editable);
                break;
            case 8:
                afterTextChanged$8(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                beforeTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                beforeTextChanged$8(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
            case 7:
                onTextChanged$7(this, charSequence, i, i2, i3);
                break;
            case 8:
                onTextChanged$8(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C1208860hYy(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$0(C1208860hYy c1208860hYy, Editable editable) {
        int length;
        ForegroundColorSpan foregroundColorSpan;
        String string;
        boolean z;
        int iIntValue;
        String string2;
        if (editable != null && (string2 = editable.toString()) != null) {
            length = string2.length();
        } else {
            length = 0;
        }
        Context context = ((EditCollectionFragment) c1208860hYy.l0).getContext();
        if (context != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1l, context);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            foregroundColorSpan = new ForegroundColorSpan(iIntValue);
        } else {
            foregroundColorSpan = null;
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        EditCollectionFragment editCollectionFragment = (EditCollectionFragment) c1208860hYy.l0;
        if (length > 30) {
            TuxTextView tuxTextView = editCollectionFragment.LLILZ;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 0);
            }
            c1360520lVa.LIZJ(C787200UuM.LIZ(length), foregroundColorSpan, 33);
        } else if (length == 0) {
            TuxTextView tuxTextView2 = editCollectionFragment.LLILZ;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
        } else {
            TuxTextView tuxTextView3 = editCollectionFragment.LLILZ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            c1360520lVa.LIZIZ(C787200UuM.LIZ(length));
        }
        c1360520lVa.LJI("/");
        c1360520lVa.LIZIZ(C787200UuM.LIZ(30));
        C1360500lVY c1360500lVY = c1360520lVa.LIZ;
        TuxTextView tuxTextView4 = ((EditCollectionFragment) c1208860hYy.l0).LLILZ;
        if (tuxTextView4 != null) {
            tuxTextView4.setText(c1360500lVY);
        }
        EditCollectionFragment editCollectionFragment2 = (EditCollectionFragment) c1208860hYy.l0;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        TuxIconView tuxIconView = editCollectionFragment2.LLILLL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
        }
        TuxSpinner tuxSpinner = editCollectionFragment2.LL;
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 8);
        }
        C11JF c11jf = editCollectionFragment2.LLJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        if (string.length() == 0) {
            TuxIconView tuxIconView2 = editCollectionFragment2.LLILLL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            TuxTextView tuxTextView5 = editCollectionFragment2.LLILZIL;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 8);
            }
            editCollectionFragment2.NR(false);
        } else if (string.length() > 30) {
            TuxTextView tuxTextView6 = editCollectionFragment2.LLILZIL;
            if (tuxTextView6 != null) {
                C786410Ut5.LLLLZLL(tuxTextView6, 0);
            }
            TuxTextView tuxTextView7 = editCollectionFragment2.LLILZIL;
            if (tuxTextView7 != null) {
                tuxTextView7.setText(editCollectionFragment2.getText(2131834453));
            }
            editCollectionFragment2.NR(false);
        } else if (a0.LJJJIL(string)) {
            TuxTextView tuxTextView8 = editCollectionFragment2.LLILZIL;
            if (tuxTextView8 != null) {
                C786410Ut5.LLLLZLL(tuxTextView8, 0);
            }
            TuxTextView tuxTextView9 = editCollectionFragment2.LLILZIL;
            if (tuxTextView9 != null) {
                tuxTextView9.setText(editCollectionFragment2.getText(2131828949));
            }
            editCollectionFragment2.NR(false);
        } else {
            TuxTextView tuxTextView10 = editCollectionFragment2.LLILZIL;
            if (tuxTextView10 != null) {
                C786410Ut5.LLLLZLL(tuxTextView10, 8);
            }
            editCollectionFragment2.NR(true);
        }
        AwS589S0100000_10 awS589S0100000_10 = editCollectionFragment2.LLJJJIL;
        if (awS589S0100000_10 != null) {
            TuxTextView tuxTextView11 = editCollectionFragment2.LLILZIL;
            if (tuxTextView11 != null && tuxTextView11.getVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            awS589S0100000_10.invoke(Boolean.valueOf(z));
        }
        if (!((EditCollectionFragment) c1208860hYy.l0).LLJJIJI && editable != null && editable.length() > 0) {
            ((EditCollectionFragment) c1208860hYy.l0).nG("edit_collection_name");
            ((EditCollectionFragment) c1208860hYy.l0).LLJJIJI = true;
        }
    }

    public static final void afterTextChanged$2(C1208860hYy c1208860hYy, Editable editable) {
        ((DefaultMixListCell) c1208860hYy.l0).L5();
        ((DefaultMixListCell) c1208860hYy.l0).P5();
        C1735430vGH c1735430vGH = ((DefaultMixListCell) c1208860hYy.l0).LLIZLLLIL;
        C1735430vGH c1735430vGH2 = null;
        if (c1735430vGH == null) {
            c1735430vGH = null;
        }
        c1735430vGH.LIZ();
        C1735430vGH c1735430vGH3 = ((DefaultMixListCell) c1208860hYy.l0).LLIZLLLIL;
        if (c1735430vGH3 != null) {
            c1735430vGH2 = c1735430vGH3;
        }
        c1735430vGH2.LJFF();
    }

    public static final void afterTextChanged$3(C1208860hYy c1208860hYy, Editable editable) {
        ((EditPlayListNameAssem) c1208860hYy.l0).No();
        ((EditPlayListNameAssem) c1208860hYy.l0).Oo();
        if (!C297000BkY.LIZ()) {
            ((EditPlayListNameAssem) c1208860hYy.l0).LLJJJIL.LIZ();
            ((EditPlayListNameAssem) c1208860hYy.l0).LLJJJIL.LJFF();
        } else {
            ((EditPlayListNameAssem) c1208860hYy.l0).Ho();
        }
    }

    public static final void afterTextChanged$4(C1208860hYy c1208860hYy, Editable editable) {
        String string;
        if (editable == null || (string = editable.toString()) == null || string.length() == 0) {
            string = null;
        }
        if (!Intrinsics.LJFF(((PoiClaimSearchAssem) c1208860hYy.l0).LLJILJILJ, String.valueOf(editable))) {
            IPoiClaimListAssemAbility iPoiClaimListAssemAbility = (IPoiClaimListAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL((PoiClaimSearchAssem) c1208860hYy.l0), IPoiClaimListAssemAbility.class, null);
            if (iPoiClaimListAssemAbility != null) {
                iPoiClaimListAssemAbility.nE0(true);
            }
            ((PoiClaimSearchAssem) c1208860hYy.l0).Go(string, false);
            PoiClaimSearchAssem poiClaimSearchAssem = (PoiClaimSearchAssem) c1208860hYy.l0;
            poiClaimSearchAssem.getClass();
            if (C1200890hM7.LIZ(string)) {
                FrameLayout frameLayout = poiClaimSearchAssem.LLIZLLLIL;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(0, frameLayout);
                    return;
                }
                return;
            }
            FrameLayout frameLayout2 = poiClaimSearchAssem.LLIZLLLIL;
            if (frameLayout2 == null) {
                return;
            }
            C786410Ut5.LJZ(8, frameLayout2);
        }
    }

    public static final void afterTextChanged$5(C1208860hYy c1208860hYy, Editable editable) {
        String string;
        String str = null;
        if (editable != null && (string = editable.toString()) != null && string.length() != 0) {
            str = string;
        }
        if (Intrinsics.LJFF(((PoiCreatorSearchAssem) c1208860hYy.l0).LLJJIJIL, String.valueOf(editable)) || ((PoiCreatorSearchAssem) c1208860hYy.l0).getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        ((PoiCreatorSearchAssem) c1208860hYy.l0).hp(str);
    }

    public static final void afterTextChanged$6(C1208860hYy c1208860hYy, Editable editable) {
        String string;
        String str = null;
        if (editable != null && (string = editable.toString()) != null && string.length() != 0) {
            str = string;
        }
        if (!Intrinsics.LJFF(((PoiSearchHeaderAssem) c1208860hYy.l0).LLJJIJIL, String.valueOf(editable))) {
            ((PoiSearchHeaderAssem) c1208860hYy.l0).So(str, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void afterTextChanged$7(X.C1208860hYy r4, android.text.Editable r5) {
        /*
            int r0 = r5.length()
            r2 = 0
            if (r0 <= 0) goto L62
            r0 = 1
        L8:
            java.lang.String r3 = "save"
            if (r0 == 0) goto L50
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem r1 = (com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem) r1
            java.lang.String r0 = r5.toString()
            r1.getClass()
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L50
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem r0 = (com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem) r0
            com.bytedance.tux.navigation.TuxNavBar r1 = r0.LLJILJILJ
            if (r1 == 0) goto L30
            r0 = 825(0x339, float:1.156E-42)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r1.LJJ(r0, r3)
        L30:
            int r0 = r5.length()
            if (r0 <= 0) goto L42
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem r0 = (com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem) r0
            com.bytedance.tux.icon.TuxIconView r0 = r0.LLJJ
            if (r0 == 0) goto L41
            X.C786410Ut5.LLLLLLZZ(r0, r2)
        L41:
            return
        L42:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem r0 = (com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem) r0
            com.bytedance.tux.icon.TuxIconView r1 = r0.LLJJ
            if (r1 == 0) goto L41
            r0 = 8
            X.C786410Ut5.LLLLLLZZ(r1, r0)
            return
        L50:
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem r0 = (com.ss.android.ugc.profile.business.ur.popup.SetUpNicknameAssem) r0
            com.bytedance.tux.navigation.TuxNavBar r1 = r0.LLJILJILJ
            if (r1 == 0) goto L30
            r0 = 823(0x337, float:1.153E-42)
            kotlin.jvm.internal.AFwS256S0000000_18 r0 = kotlin.jvm.internal.AFwS256S0000000_18.get$arr$(r0)
            r1.LJJ(r0, r3)
            goto L30
        L62:
            r0 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208860hYy.afterTextChanged$7(X.0hYy, android.text.Editable):void");
    }

    public static final void afterTextChanged$8(C1208860hYy c1208860hYy, Editable editable) {
        String string;
        if (editable != null && (string = editable.toString()) != null) {
            ((C094D) c1208860hYy.l0).LJIIIIZZ(string);
        }
    }

    public static final void beforeTextChanged$4(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
        ((PoiClaimSearchAssem) c1208860hYy.l0).LLJILJILJ = String.valueOf(charSequence);
    }

    public static final void beforeTextChanged$5(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
        ((PoiCreatorSearchAssem) c1208860hYy.l0).LLJJIJIL = String.valueOf(charSequence);
    }

    public static final void beforeTextChanged$6(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
        ((PoiSearchHeaderAssem) c1208860hYy.l0).LLJJIJIL = String.valueOf(charSequence);
    }

    public static final void onTextChanged$1(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) {
        CharSequence charSequenceLJLIIIL;
        C197039127h c197039127h = (C197039127h) c1208860hYy.l0;
        if (c197039127h != null) {
            boolean z = false;
            if (charSequence != null && (charSequenceLJLIIIL = a0.LJLIIIL(charSequence)) != null && charSequenceLJLIIIL.length() > 0) {
                z = true;
            }
            c197039127h.setEnabled(z);
        }
    }

    public static final void onTextChanged$7(C1208860hYy c1208860hYy, CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        ((SetUpNicknameAssem) c1208860hYy.l0).Jo();
    }
}
