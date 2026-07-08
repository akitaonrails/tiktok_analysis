package X;

import Y.ACListenerS15S1400000_28;
import Y.AObserverS207S0100000_3;
import Y.AfS185S0100000_16;
import Y.AfS197S0100000_28;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Layout;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.tiktok.tpsc.model.ContentReuseAccountExtra;
import com.ss.android.ugc.tiktok.tpsc.model.ContentReuseItemExtra;
import com.ss.android.ugc.tiktok.tpsc.model.PopupExtra;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsAgreementRecord;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS142S1100000_28;
import kotlin.jvm.internal.AwS40S1110000_28;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS90S1300000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10BK, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10BK {
    public static final C10BK LIZ = new C10BK();

    public static String LIZLLL(int i, Context context) {
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return "";
                }
                return context.getString(2131846564);
            }
            return context.getString(2131846562);
        }
        return context.getString(2131846561);
    }

    public static String LJ(int i, Context context) {
        if (i != 1) {
            if (i != 4) {
                if (i != 5) {
                    return "";
                }
                return context.getString(2131846564);
            }
            return context.getString(2131846562);
        }
        return context.getString(2131846561);
    }

    public static void LIZ(Context context, FragmentManager fragmentManager, final String str) {
        C191880104w.LIZ.getClass();
        if (!C191880104w.LJIILIIL("unified_toggle_popup")) {
            return;
        }
        C770750ULh c770750ULh = new C770750ULh();
        c770750ULh.LJ = context.getText(2131846571);
        c770750ULh.LIZJ(context.getText(2131846569));
        c770750ULh.LJI(context.getText(2131846570), AFwS271S0000000_28.get$arr$(433));
        c770750ULh.LJIILLIIL = true;
        C1390920mIc c1390920mIcLIZIZ = c770750ULh.LIZIZ();
        DialogInterface.OnDismissListener onDismissListener = new DialogInterface.OnDismissListener() { // from class: X.106O
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                String str2;
                C191880104w.LIZ.getClass();
                C191880104w.LJIJ(2, "unified_toggle_popup");
                String str3 = TuxSheet._pnsPageId;
                AbstractC343940De4 abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
                String str4 = str;
                C1163504gr c1163504gr = C1163504gr.LIZIZ;
                C191969108h c191969108h = new C191969108h();
                c191969108h.LIZLLL("enter_from", str4);
                if (!Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343980De8.LIZ) && !Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343960De6.LIZ)) {
                    if (Intrinsics.LJFF(abstractC343940De4LJIIJJI, C343970De7.LIZ)) {
                        str2 = "gray_area";
                    } else {
                        str2 = "ok";
                    }
                } else {
                    str2 = "x";
                }
                c191969108h.LIZLLL("value", str2);
                c1163504gr.onEventV3("click_reuse_content_notification", c191969108h.LIZ);
            }
        };
        TuxSheet tuxSheet = c1390920mIcLIZIZ.LIZ;
        tuxSheet.LLILLJJLI = onDismissListener;
        tuxSheet.show(fragmentManager, (String) null);
        C1163504gr c1163504gr = C1163504gr.LIZIZ;
        C191969108h c191969108h = new C191969108h();
        c191969108h.LIZLLL("enter_from", str);
        c1163504gr.onEventV3("show_reuse_content_notification", c191969108h.LIZ);
    }

    public static void LIZIZ(Context context, FragmentManager fragmentManager, String str, Function1 function1) {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOptionLIZ;
        C191880104w.LIZ.getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("account_content_reuse");
        if (privacySettingsAgreementRecordLJI != null) {
            PopupExtra popupExtra = privacySettingsAgreementRecordLJI.popupExtra;
            int i = 1;
            if (privacySettingsAgreementRecordLJI != null && privacySettingsAgreementRecordLJI.status == 1 && (popupExtra instanceof ContentReuseAccountExtra)) {
                C10BK c10bk = LIZ;
                ContentReuseAccountExtra contentReuseAccountExtra = (ContentReuseAccountExtra) popupExtra;
                AwS90S1300000_28 awS90S1300000_28 = new AwS90S1300000_28(context, (Context) fragmentManager, (FragmentManager) str, (String) function1, (Function1<? super Boolean, Unit>) 5);
                c10bk.getClass();
                View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.bdy, null);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
                c1390920mIc.LJIIIIZZ(4);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJLLL = false;
                tuxSheet.LLILLL = false;
                tuxSheet.LLJLLIL = false;
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                C786410Ut5.LJLLJ(context, R.layout.bdz, (ViewGroup) viewLJLLJ.findViewById(R.id.eux));
                MutableLiveData mutableLiveData = new MutableLiveData(0);
                ((TextView) viewLJLLJ.findViewById(R.id.a0o)).setText(LIZLLL(contentReuseAccountExtra.noPaDuet, context));
                ((TextView) viewLJLLJ.findViewById(R.id.a0s)).setText(LIZLLL(contentReuseAccountExtra.noPaStitch, context));
                ((TextView) viewLJLLJ.findViewById(R.id.a0r)).setText(LJ(contentReuseAccountExtra.noPaCreateSticker, context));
                ((TextView) viewLJLLJ.findViewById(R.id.a0t)).setText(LJ(contentReuseAccountExtra.noPaShareToStory, context));
                PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "content_reuse_permission");
                boolean z = C191985108x.LIZLLL(privacySettingsRestrictionItemLJIIJJI).LIZIZ;
                int i2 = 5;
                List listLJIIJJI = C1697810uHb.LJIIJJI(1, 4, 5);
                ArrayList arrayList = new ArrayList();
                if (z) {
                    Iterator it2 = listLJIIJJI.iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        if (iIntValue != i && iIntValue != 4) {
                            if (iIntValue == i2) {
                                if (privacySettingsRestrictionItemLJIIJJI != null) {
                                    privacySettingsRestrictionOptionLIZ = C856230XiP.LIZ(privacySettingsRestrictionItemLJIIJJI, Integer.valueOf(iIntValue));
                                } else {
                                    privacySettingsRestrictionOptionLIZ = null;
                                }
                                if (C191985108x.LJ(privacySettingsRestrictionOptionLIZ).LIZIZ) {
                                    Integer numValueOf = Integer.valueOf(iIntValue);
                                    LIZ.getClass();
                                    arrayList.add(new Pair(numValueOf, LJ(iIntValue, context)));
                                }
                            }
                        } else {
                            Integer numValueOf2 = Integer.valueOf(iIntValue);
                            LIZ.getClass();
                            arrayList.add(new Pair(numValueOf2, LJ(iIntValue, context)));
                        }
                        i = 1;
                        i2 = 5;
                    }
                }
                LJFF((LinearLayout) viewLJLLJ.findViewById(R.id.pq8), arrayList, mutableLiveData, tuxSheet2, new AwS142S1100000_28(str, contentReuseAccountExtra, 8));
                C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.whh);
                c197039127h.setText(context.getString(2131846558));
                mutableLiveData.observe(tuxSheet2, new AObserverS207S0100000_3(c197039127h, 11));
                C786410Ut5.U8(c197039127h, new ACListenerS15S1400000_28(mutableLiveData, str, contentReuseAccountExtra, viewLJLLJ, awS90S1300000_28, 3));
                tuxSheet2.show(fragmentManager, (String) null);
                C10BM.LJ("account", str, C2097608Jq.LJIIIIZZ(new Pair("duet_status", C10BM.LIZ(contentReuseAccountExtra.noPaDuet)), new Pair("stitch_status", C10BM.LIZ(contentReuseAccountExtra.noPaStitch)), new Pair("sticker_status", C10BM.LIZIZ(contentReuseAccountExtra.noPaCreateSticker)), new Pair("story_status", C10BM.LIZIZ(contentReuseAccountExtra.noPaShareToStory))));
                return;
            }
        }
        LIZJ(context, fragmentManager, str, function1, true);
    }

    public static final void LIZJ(Context context, FragmentManager fragmentManager, final String str, Function1<? super Boolean, Unit> function1, final boolean z) {
        String str2;
        C191880104w.LIZ.getClass();
        PrivacySettingsAgreementRecord privacySettingsAgreementRecordLJI = C191880104w.LJI("item_content_reuse");
        if (privacySettingsAgreementRecordLJI != null) {
            PopupExtra popupExtra = privacySettingsAgreementRecordLJI.popupExtra;
            if (privacySettingsAgreementRecordLJI != null && privacySettingsAgreementRecordLJI.status == 1 && (popupExtra instanceof ContentReuseItemExtra)) {
                C10BK c10bk = LIZ;
                final ContentReuseItemExtra contentReuseItemExtra = (ContentReuseItemExtra) popupExtra;
                final AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(function1, (Function1<? super Boolean, Unit>) 1060);
                c10bk.getClass();
                final View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.bdy, null);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIII = viewLJLLJ;
                c1390920mIc.LJIIIIZZ(4);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIIJIL = true;
                tuxSheet.LLJLILLLLZIIL = false;
                tuxSheet.LLJLLL = false;
                tuxSheet.LLILLL = false;
                tuxSheet.LLJLLIL = false;
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                int i = contentReuseItemExtra.inconsistentCount;
                if (z) {
                    C786410Ut5.LJLLJ(context, R.layout.be0, (ViewGroup) viewLJLLJ.findViewById(R.id.eux));
                    TextView textView = (TextView) viewLJLLJ.findViewById(R.id.ew9);
                    C444910HcX c444910HcX = new C444910HcX(LJ(contentReuseItemExtra.noPaContentReusePermission, context));
                    c444910HcX.LIZ(102);
                    textView.setText(C20588115hH.LIZJ(viewLJLLJ.getContext(), 2131846573, c444910HcX));
                    ((TextView) viewLJLLJ.findViewById(R.id.ew_)).setText(viewLJLLJ.getContext().getString(2131846574, Integer.valueOf(i)));
                    ((TextView) viewLJLLJ.findViewById(R.id.ewa)).setText(viewLJLLJ.getContext().getString(2131846572, Integer.valueOf(i)));
                } else {
                    C786410Ut5.LJLLJ(context, R.layout.be1, (ViewGroup) viewLJLLJ.findViewById(R.id.eux));
                    C21415018rM c21415018rM = (C21415018rM) viewLJLLJ.findViewById(R.id.ewd);
                    String string = viewLJLLJ.getContext().getString(2131846581, Integer.valueOf(i));
                    C444830HcP c444830HcP = new C444830HcP();
                    c444830HcP.LJIILIIL(string);
                    c444830HcP.LJII(123);
                    int iLIZIZ = C497820Jfg.LIZIZ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64));
                    C444840HcQ c444840HcQ = c444830HcP.LIZIZ;
                    c444840HcQ.LJ = iLIZIZ;
                    c444840HcQ.LJI = Layout.Alignment.ALIGN_CENTER;
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context);
                    if (numLIZJ != null) {
                        c444830HcP.LJIILJJIL(numLIZJ.intValue());
                    }
                    c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.5f, false, C431830GwX.LIZ(c444830HcP, null, null), 26));
                    ((TextView) viewLJLLJ.findViewById(R.id.ewb)).setText(viewLJLLJ.getContext().getString(2131846580, Integer.valueOf(i)));
                    ((TextView) viewLJLLJ.findViewById(R.id.ewc)).setText(viewLJLLJ.getContext().getString(2131846579, Integer.valueOf(i)));
                }
                final MutableLiveData mutableLiveData = new MutableLiveData(0);
                LJFF((LinearLayout) viewLJLLJ.findViewById(R.id.pq8), C1697810uHb.LJIIJJI(new Pair(1, viewLJLLJ.getContext().getString(2131846578)), new Pair(2, viewLJLLJ.getContext().getString(2131846577))), mutableLiveData, tuxSheet2, new AwS40S1110000_28(z, str, contentReuseItemExtra, 1));
                C197039127h c197039127h = (C197039127h) viewLJLLJ.findViewById(R.id.whh);
                c197039127h.setText(context.getString(2131846575));
                mutableLiveData.observe(tuxSheet2, new AObserverS207S0100000_3(c197039127h, 12));
                C786410Ut5.U8(c197039127h, new View.OnClickListener() { // from class: X.10BL
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        String str3;
                        C191880104w c191880104w = C191880104w.LIZ;
                        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("item_content_reuse_setting", String.valueOf(mutableLiveData.getValue())));
                        c191880104w.getClass();
                        C11JN c11jnLJIILJJIL = C191880104w.LJIILJJIL(2, "item_content_reuse", mapLIZJ);
                        Function0<Unit> function0 = awS572S0100000_28;
                        c11jnLJIILJJIL.LJJLL(new AfS197S0100000_28(function0, 88), new AfS185S0100000_16(function0, 53));
                        String str4 = TuxSheet._pnsPageId;
                        C1391190mJ3.LJ(viewLJLLJ, C343970De7.LIZ);
                        if (z) {
                            str3 = "video_type1";
                        } else {
                            str3 = "video_type2";
                        }
                        C10BM.LIZLLL(str3, str, "ok", C2097908Jt.LIZJ(new Pair("inconsistent_num", String.valueOf(contentReuseItemExtra.inconsistentCount))));
                    }
                });
                tuxSheet2.show(fragmentManager, (String) null);
                if (z) {
                    str2 = "video_type1";
                } else {
                    str2 = "video_type2";
                }
                C10BM.LJ(str2, str, C2097908Jt.LIZJ(new Pair("inconsistent_num", String.valueOf(contentReuseItemExtra.inconsistentCount))));
                return;
            }
        }
        if (z) {
            LIZ.getClass();
            LIZ(context, fragmentManager, str);
        }
        if (function1 == null) {
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    public static void LJFF(LinearLayout linearLayout, List list, final MutableLiveData mutableLiveData, TuxSheet tuxSheet, final Function1 function1) {
        C786410Ut5.LJJJJJL(linearLayout);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                Pair pair = (Pair) obj;
                final int iIntValue = ((Number) pair.getFirst()).intValue();
                String str = (String) pair.getSecond();
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(new ContextThemeWrapper(linearLayout.getContext(), R.style.aba)), R.layout.bec, linearLayout, false);
                C127K c127k = (C127K) viewTd.findViewById(R.id.l1c);
                c127k.setTitle(str);
                final AnonymousClass1278 anonymousClass1278 = new AnonymousClass1278(c127k.getContext());
                anonymousClass1278.LJIILLIIL(new CompoundButton.OnCheckedChangeListener() { // from class: X.00xo
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        mutableLiveData.setValue(Integer.valueOf(iIntValue));
                        Function1<Integer, Unit> function12 = function1;
                        if (function12 != null) {
                            function12.invoke(Integer.valueOf(iIntValue));
                        }
                    }
                });
                mutableLiveData.observe(tuxSheet, new Observer() { // from class: X.0OKy
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        boolean z;
                        Integer num = (Integer) obj2;
                        AnonymousClass1278 anonymousClass12782 = anonymousClass1278;
                        int i3 = iIntValue;
                        if (num != null && num.intValue() == i3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        anonymousClass12782.LJIILJJIL(z);
                    }
                });
                c127k.setAccessory(anonymousClass1278);
                if (i == 0) {
                    c127k.LJ(true, false);
                } else if (i == list.size() - 1) {
                    c127k.LJ(false, true);
                } else {
                    c127k.LJ(false, false);
                }
                linearLayout.addView(viewTd);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
