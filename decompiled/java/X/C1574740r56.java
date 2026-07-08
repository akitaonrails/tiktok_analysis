package X;

import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility;
import com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem.VibeFeedMenuAssem;
import com.ss.android.ugc.aweme.vibefeed.viewmodel.VibeFeedUser;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import com.ss.android.ugc.feed.platform.fragment.IFeedFragmentAbility;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r56, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final /* synthetic */ class C1574740r56 extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1574740r56(VibeFeedMenuAssem vibeFeedMenuAssem) {
        super(1, vibeFeedMenuAssem, VibeFeedMenuAssem.class, "onTurnOffVibeFeed", "onTurnOffVibeFeed(Z)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z;
        String str;
        String str2;
        ?? arrayList;
        String str3;
        String str4;
        EnumC912680ZrG enumC912680ZrG;
        boolean zBooleanValue = bool.booleanValue();
        VibeFeedMenuAssem vibeFeedMenuAssem = (VibeFeedMenuAssem) this.receiver;
        vibeFeedMenuAssem.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTurnOffVibeFeed: closeSuccess ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        DialogC1389620mGW dialogC1389620mGW = vibeFeedMenuAssem.LLJIJIL;
        if (dialogC1389620mGW != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        if (zBooleanValue) {
            String strLIZ = C1575440r6E.LIZ();
            C636770OyJ c636770OyJGo = vibeFeedMenuAssem.Go();
            if (c636770OyJGo != null && (enumC912680ZrG = c636770OyJGo.LL) != null && enumC912680ZrG.isGroup()) {
                z = true;
            } else {
                z = false;
            }
            String str5 = "";
            InterfaceC494301wD interfaceC494301wD = null;
            if (z) {
                AssemVMLazy assemVMLazy = vibeFeedMenuAssem.LLJI;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = VibeFeedMenuAssem.LLJILJIL;
                List<VibeFeedUser> list = ((C0P3X) assemVMLazy.getValue().getState()).LLJIJIL;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (VibeFeedUser vibeFeedUser : list) {
                        if (!Intrinsics.LJFF(vibeFeedUser.userId, strLIZ)) {
                            arrayList.add(vibeFeedUser);
                        }
                    }
                } else {
                    arrayList = C13BV.INSTANCE;
                }
                if (arrayList.size() >= 2) {
                    C1575210r5r c1575210r5r = C1575210r5r.LLILLJJLI;
                    C636770OyJ c636770OyJGo2 = vibeFeedMenuAssem.Go();
                    if (c636770OyJGo2 == null || (str4 = c636770OyJGo2.LLILZ) == null) {
                        str4 = "";
                    }
                    c1575210r5r.LJII(EnumC1575230r5t.ACCEPTING, str4);
                } else {
                    C1575210r5r c1575210r5r2 = C1575210r5r.LLILLJJLI;
                    C636770OyJ c636770OyJGo3 = vibeFeedMenuAssem.Go();
                    if (c636770OyJGo3 == null || (str3 = c636770OyJGo3.LLILZ) == null) {
                        str3 = "";
                    }
                    c1575210r5r2.LJII(EnumC1575230r5t.CLOSED, str3);
                }
            } else {
                C1575210r5r c1575210r5r3 = C1575210r5r.LLILLJJLI;
                C636770OyJ c636770OyJGo4 = vibeFeedMenuAssem.Go();
                if (c636770OyJGo4 == null || (str = c636770OyJGo4.LLILZ) == null) {
                    str = "";
                }
                c1575210r5r3.LJII(EnumC1575230r5t.CLOSED, str);
            }
            C0P38 c0p38LIZ = C0P30.LIZ();
            C636770OyJ c636770OyJGo5 = vibeFeedMenuAssem.Go();
            if (c636770OyJGo5 != null && (str2 = c636770OyJGo5.LLILZ) != null) {
                str5 = str2;
            }
            c0p38LIZ.LIZIZ(str5, "turn off");
            Fragment fragmentLJI = C724240Sb0.LJI(vibeFeedMenuAssem);
            if (fragmentLJI != null) {
                InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI, null), IFeedFragmentAbility.class, null);
                if (interfaceC494301wDLIZ instanceof IDetailPageAbility) {
                    interfaceC494301wD = interfaceC494301wDLIZ;
                }
                IDetailBaseAbility iDetailBaseAbility = (IDetailBaseAbility) interfaceC494301wD;
                if (iDetailBaseAbility != null) {
                    iDetailBaseAbility.yF(-1, "vibe_turn_off");
                }
            }
        }
        return Unit.LIZ;
    }
}
