package X;

import Y.AObserverS230S0100000_28;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.network.model.BaseResponse;
import com.ss.android.ugc.tiktok.pns.privacy.setting.base.api.IPrivacySettingsDepService;
import kotlin.Pair;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.106Y, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C106Y extends C191977108p {
    public final C107N LLJILJILJ;
    public final C107J LLJILLL;
    public Boolean LLJJ;
    public InterfaceC191831102z LLJJI;
    public final String LLJJIII;

    @Override // X.AbstractC191963108b, X.AbstractC191843103l
    public final void LJIIIIZZ() {
        C107J c107j = this.LLJILLL;
        if (c107j != null) {
            c107j.LIZIZ(this.LLJ.LIZ);
        }
        super.LJIIIIZZ();
    }

    @Override // X.AbstractC191843103l
    public final void LJIIJ() {
        C107J c107j;
        MutableLiveData<Integer> mutableLiveDataLIZ;
        C107J c107j2;
        C107J c107j3;
        C107J c107j4 = this.LLJILLL;
        if (c107j4 != null) {
            c107j4.onShow();
        }
        if (this.LLJILLL instanceof C107C) {
            String str = this.LLJILJILJ.LJIIIZ;
            int iHashCode = str.hashCode();
            if (iHashCode != -2099038552) {
                if (iHashCode != -1124815836) {
                    if (iHashCode != -99623184 || !str.equals("dm_setting_friends") || (c107j3 = this.LLJILLL) == null) {
                        return;
                    } else {
                        mutableLiveDataLIZ = c107j3.LIZLLL();
                    }
                } else if (!str.equals("dm_setting_potential_connection") || (c107j2 = this.LLJILLL) == null) {
                    return;
                } else {
                    mutableLiveDataLIZ = c107j2.LIZJ();
                }
            } else if (!str.equals("dm_setting_others") || (c107j = this.LLJILLL) == null) {
                return;
            } else {
                mutableLiveDataLIZ = c107j.LIZ();
            }
            if (mutableLiveDataLIZ != null) {
                mutableLiveDataLIZ.observe(this.LLJ.LIZJ, new AObserverS230S0100000_28(this, 62));
            }
        }
    }

    public C106Y(C191848103q c191848103q, C107N c107n) {
        String strLJIILLIIL;
        String string;
        super(c191848103q, c107n);
        this.LLJILJILJ = c107n;
        IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
        if (iPrivacySettingsDepService != null) {
            strLJIILLIIL = iPrivacySettingsDepService.LJIILLIIL();
        } else {
            strLJIILLIIL = null;
        }
        this.LLJJIII = strLJIILLIIL;
        if (!Intrinsics.LJFF(c107n.LIZ, "dm_potential_connection_options") && !Intrinsics.LJFF(c107n.LIZ, "dm_others_options")) {
            this.LLJJ = Boolean.valueOf(C191985108x.LIZLLL(LJIJJLI()).LIZIZ);
            this.LLJJI = new C104W(c107n.LJIIIZ);
        } else {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c191848103q.LIZJ), null, null, new C1408060mkG(this, null), 3);
        }
        Bundle bundle = c191848103q.LJ;
        if (bundle != null && (string = bundle.getString("page_scene")) != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != 100344454) {
                if (iHashCode == 1243300867 && string.equals("inbox_guide")) {
                    this.LLJILLL = new C107C(c191848103q.LIZIZ, c107n.LJIIIZ);
                    return;
                }
            } else if (string.equals("inbox")) {
                this.LLJILLL = new C108A(c191848103q.LIZIZ, c107n.LJIIIZ);
                return;
            }
        }
        this.LLJILLL = new C108B(c191848103q.LIZIZ);
    }

    public static void LJJIJIL(int i, String str) {
        C1163504gr.LIZIZ.onEventV3("permission_change_confirmation", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("confirm_action", String.valueOf(i))));
    }

    @Override // X.AbstractC191963108b, X.InterfaceC191831102z
    public final CharSequence LIZJ(Context context, CharSequence charSequence) {
        CharSequence charSequenceLIZJ;
        InterfaceC191831102z interfaceC191831102z = this.LLJJI;
        if (interfaceC191831102z == null || (charSequenceLIZJ = interfaceC191831102z.LIZJ(context, charSequence)) == null) {
            return super.LIZJ(context, charSequence);
        }
        return charSequenceLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    @Override // X.AbstractC191963108b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIL(int r23, android.view.View r24) {
        /*
            Method dump skipped, instruction units count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106Y.LJIL(int, android.view.View):boolean");
    }

    @Override // X.C191977108p
    public final boolean LJJI(int i, boolean z) {
        MutableLiveData<Integer> mutableLiveDataLIZ;
        Integer value;
        MutableLiveData<Integer> mutableLiveDataLIZJ;
        Integer value2;
        MutableLiveData<Integer> mutableLiveDataLIZLLL;
        Integer value3;
        String str = this.LLJILJILJ.LJIIIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -2099038552) {
            if (iHashCode != -1124815836) {
                if (iHashCode == -99623184 && str.equals("dm_setting_friends")) {
                    C107J c107j = this.LLJILLL;
                    if (c107j == null || (mutableLiveDataLIZLLL = c107j.LIZLLL()) == null || (value3 = mutableLiveDataLIZLLL.getValue()) == null || i != value3.intValue()) {
                        return false;
                    }
                } else {
                    return z;
                }
            } else {
                if (!str.equals("dm_setting_potential_connection")) {
                    return z;
                }
                C107J c107j2 = this.LLJILLL;
                if (c107j2 == null || (mutableLiveDataLIZJ = c107j2.LIZJ()) == null || (value2 = mutableLiveDataLIZJ.getValue()) == null || i != value2.intValue()) {
                    return false;
                }
            }
        } else {
            if (!str.equals("dm_setting_others")) {
                return z;
            }
            C107J c107j3 = this.LLJILLL;
            if (c107j3 == null || (mutableLiveDataLIZ = c107j3.LIZ()) == null || (value = mutableLiveDataLIZ.getValue()) == null || i != value.intValue()) {
                return false;
            }
        }
        return true;
    }

    @Override // X.C191977108p
    public final boolean LJJIFFI(int i, boolean z) {
        if (Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "dm_setting_potential_connection") || Intrinsics.LJFF(this.LLJILJILJ.LJIIIZ, "dm_setting_others")) {
            C106T.LIZ.getClass();
            IPrivacySettingsDepService iPrivacySettingsDepService = (IPrivacySettingsDepService) PluggableExtentionKt.pluggableSpi$default(IPrivacySettingsDepService.class, false, false, false, 14, null);
            if (iPrivacySettingsDepService != null && iPrivacySettingsDepService.LIZLLL()) {
                return false;
            }
        }
        return z;
    }

    @Override // X.C191977108p
    public final boolean LJJIIJ(int i, boolean z) {
        if (i == 1) {
            if (Intrinsics.LJFF(this.LLJJ, Boolean.TRUE) || z) {
                return true;
            }
            return false;
        }
        return z;
    }

    @Override // X.C191977108p
    public final void LJJIJIIJI(int i, View view) {
        C107J c107j = this.LLJILLL;
        if (c107j == null || c107j.LJ(i)) {
            super.LJJIJIIJI(i, view);
        }
    }

    @Override // X.C191977108p
    public final void LJJIJIIJIL(int i, int i2, BaseResponse baseResponse) {
        String string;
        String str;
        Activity activity;
        Fragment fragment;
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        Pair[] pairArr = new Pair[5];
        Bundle bundle = this.LLJ.LJ;
        String str2 = "";
        if (bundle != null) {
            string = bundle.getString("enter_from", "");
        } else {
            string = null;
        }
        pairArr[0] = new Pair("enter_from", string);
        String str3 = this.LLJILJILJ.LJIIIZ;
        int iHashCode = str3.hashCode();
        if (iHashCode != -2099038552) {
            if (iHashCode != -1124815836) {
                if (iHashCode == -99623184 && str3.equals("dm_setting_friends")) {
                    str2 = "friends";
                }
            } else if (str3.equals("dm_setting_potential_connection")) {
                str2 = "potential_connections";
            }
        } else if (str3.equals("dm_setting_others")) {
            str2 = "others_on_tiktok";
        }
        pairArr[1] = new Pair("updated_permission", str2);
        pairArr[2] = new Pair("updated_result", String.valueOf(i2));
        if (Intrinsics.LJFF(this.LLJJ, Boolean.TRUE)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("permission_type", str);
        pairArr[4] = new Pair("user_account_type", this.LLJJIII);
        c1163504gr.onEventV3("dm_permission_settings_updated", C2097608Jq.LJIIIIZZ(pairArr));
        Object obj = this.LLJ.LIZJ;
        if (obj instanceof Activity) {
            activity = (Activity) obj;
        } else {
            activity = null;
        }
        if (activity != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIIZ(2131830796);
            c1389890mGx.LJIIJJI();
        }
        LifecycleOwner lifecycleOwner = this.LLJ.LIZJ;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(fragment);
            c1389890mGx2.LJIIIZ(2131830796);
            c1389890mGx2.LJIIJJI();
        }
    }

    public final void LJJIJLIJ(View view, int i, int i2, int i3, String str, boolean z, boolean z2) {
        C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
        c1397580mTM.LJFF(i);
        c1397580mTM.LIZ(i2);
        if (z) {
            C1397720mTa.LIZ(c1397580mTM, view.getContext().getString(2131831337), new AwS607S0100000_28(c1397580mTM, 190));
        }
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new C107L(z2, this, str, view, i3));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
