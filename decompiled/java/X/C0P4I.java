package X;

import android.widget.CompoundButton;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.inbox.workbench.view.WorkBenchSettingSwitchCell;
import com.ss.android.ugc.aweme.inbox.workbench.viewmodel.WorkBenchSettingViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceFunction;
import com.ss.android.ugc.aweme.topic.book.creator.BookSearchItemCell;
import com.ss.android.ugc.aweme.topic.common.creator.TopicSearchListAssem;
import com.ss.android.ugc.aweme.topic.common.creator.vm.TopicSearchViewModel;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.movie.creator.MovieSearchItemCell;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS9S0501000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0P4I, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4I implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
        }
    }

    public static final void onCheckedChanged$0(C0P4I c0p4i, CompoundButton compoundButton, boolean z) {
        Map<String, String> map;
        AssemVMLazy assemVMLazy = ((BookSearchItemCell) c0p4i.l0).LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = BookSearchItemCell.LLILLL;
        String str = ((TopicSearchViewModel) assemVMLazy.getValue()).LL;
        if (str != null && str.length() != 0) {
            C2344009Gk c2344009Gk = ((C0OAT) c0p4i.l1).LLILLL;
            if (c2344009Gk != null) {
                map = c2344009Gk.LIZ;
            } else {
                map = null;
            }
            C20684815ws.LJIILLIIL("trending_words_click", map);
        } else {
            C2344009Gk c2344009Gk2 = new C2344009Gk();
            TopicRawInfo topicRawInfo = (TopicRawInfo) c0p4i.l3;
            c2344009Gk2.LJFF("book_id", topicRawInfo.id);
            c2344009Gk2.LJFF("book_title", topicRawInfo.title);
            C20684815ws.LJIILLIIL("book_trending_list_click", c2344009Gk2.LIZ);
        }
        C0HZQ c0hzq = (C0HZQ) c0p4i.l2;
        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = ((BookSearchItemCell) c0p4i.l0).LL;
        if (topicSelectedAbility != null) {
            z = topicSelectedAbility.BI((TopicRawInfo) c0p4i.l3, z);
        }
        c0hzq.setChecked(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0199  */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.0Ovu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onCheckedChanged$1(X.C0P4I r22, android.widget.CompoundButton r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0P4I.onCheckedChanged$1(X.0P4I, android.widget.CompoundButton, boolean):void");
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [X.0Ovi] */
    public static final void onCheckedChanged$2(C0P4I c0p4i, CompoundButton compoundButton, boolean z) {
        int i;
        String str;
        List<InboxEntranceFunction> list;
        InboxEntranceFunction next;
        int i2;
        int i3;
        int i4;
        AssemVMLazy assemVMLazy = ((WorkBenchSettingSwitchCell) c0p4i.l0).LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = WorkBenchSettingSwitchCell.LLILZIL;
        WorkBenchSettingViewModel workBenchSettingViewModel = (WorkBenchSettingViewModel) assemVMLazy.getValue();
        C635250Ovr c635250Ovr = (C635250Ovr) c0p4i.l1;
        final WorkBenchSettingSwitchCell workBenchSettingSwitchCell = (WorkBenchSettingSwitchCell) c0p4i.l0;
        final C127K c127k = (C127K) c0p4i.l3;
        ?? r8 = new InterfaceC635170Ovj() { // from class: X.0Ovi
            @Override // X.InterfaceC635170Ovj
            public final void LIZ() {
                C1389890mGx c1389890mGx = new C1389890mGx(c127k);
                c1389890mGx.LJIIIZ(2131828035);
                c1389890mGx.LJIIJJI();
            }

            @Override // X.InterfaceC635170Ovj
            public final void LIZIZ() {
                workBenchSettingSwitchCell.I5();
            }

            @Override // X.InterfaceC635170Ovj
            public final void LIZJ(boolean z2) {
                C127A c127a = workBenchSettingSwitchCell.LLILLL;
                if (c127a != null) {
                    c127a.LJIIJJI(z2);
                }
            }
        };
        InboxEntranceFunction inboxEntranceFunction = c635250Ovr.LL;
        if (inboxEntranceFunction != null) {
            r8.LIZJ(true);
            int i5 = inboxEntranceFunction.actionStatus;
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = -1;
            int i6 = inboxEntranceFunction.functionType;
            C0ORP c0orp = C0ORP.MUTE;
            if (i6 == c0orp.getType()) {
                if (i5 == 1) {
                    i2 = 6;
                    i4 = 0;
                } else {
                    i2 = 5;
                    i4 = 1;
                }
                c118300cf.element = i4;
                InterfaceC420801kM interfaceC420801kM = workBenchSettingViewModel.LLILZ;
                if (interfaceC420801kM != null) {
                    interfaceC420801kM.dispose();
                }
            } else {
                if (i6 == C0ORP.PIN.getType()) {
                    if (i5 == 1) {
                        i2 = 2;
                        i3 = 0;
                    } else {
                        i2 = 1;
                        i3 = 1;
                    }
                    c118300cf.element = i3;
                    InterfaceC420801kM interfaceC420801kM2 = workBenchSettingViewModel.LLILZIL;
                    if (interfaceC420801kM2 != null) {
                        interfaceC420801kM2.dispose();
                    }
                }
                i = 6;
            }
            i = 6;
            InterfaceC420801kM interfaceC420801kMLJJLIIJ = ((InterfaceC624050Odn) workBenchSettingViewModel.LL.getValue().getOperator()).LJJLIIJ(c635250Ovr.LLILLJJLI, i2, new AwS9S0501000_9((C635160Ovi) r8, inboxEntranceFunction, i5, workBenchSettingViewModel, c635250Ovr, c118300cf, 1), new AwS553S0100000_9((C635160Ovi) r8, 1670));
            int i7 = inboxEntranceFunction.functionType;
            if (i7 == c0orp.getType()) {
                workBenchSettingViewModel.LLILZ = interfaceC420801kMLJJLIIJ;
            } else if (i7 == C0ORP.PIN.getType()) {
                workBenchSettingViewModel.LLILZIL = interfaceC420801kMLJJLIIJ;
            } else {
                interfaceC420801kMLJJLIIJ.dispose();
            }
        } else {
            i = 6;
        }
        WorkBenchSettingSwitchCell workBenchSettingSwitchCell2 = (WorkBenchSettingSwitchCell) c0p4i.l0;
        InboxEntranceFunction inboxEntranceFunction2 = (InboxEntranceFunction) c0p4i.l2;
        workBenchSettingSwitchCell2.getClass();
        Pair[] pairArr = new Pair[i];
        pairArr[0] = new Pair("enter_from", "setting_page");
        pairArr[1] = new Pair("cell_type", "brand_partnership");
        pairArr[2] = new Pair("action_type", "click");
        String str2 = "mute";
        String str3 = "";
        if (inboxEntranceFunction2.functionType == C0ORP.PIN.getType()) {
            if (inboxEntranceFunction2.actionStatus == 0) {
                str = "pin";
            } else {
                str = "unpin";
            }
        } else if (inboxEntranceFunction2.functionType != C0ORP.MUTE.getType()) {
            str = "";
        } else if (inboxEntranceFunction2.actionStatus == 0) {
            str = "mute";
        } else {
            str = "unmute";
        }
        pairArr[3] = new Pair("type", str);
        EntranceSettings entranceSettings = ((WorkBenchSettingViewModel) workBenchSettingSwitchCell2.LL.getValue()).LLILLJJLI;
        C0ZBF c0zbfLIZ = null;
        if (entranceSettings != null && (list = entranceSettings.functionSettings) != null) {
            Iterator<InboxEntranceFunction> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.functionType == C0ORP.MUTE.getType()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InboxEntranceFunction inboxEntranceFunction3 = next;
            if (inboxEntranceFunction3 != null) {
                c0zbfLIZ = C0ZBG.LIZ(Integer.valueOf(inboxEntranceFunction3.actionStatus));
            }
        }
        if (c0zbfLIZ != C0ZBF.MUTE) {
            str2 = "unmute";
        }
        pairArr[4] = new Pair("mute_status", str2);
        String str4 = C0NBD.LIZ;
        if (str4 != null) {
            str3 = str4;
        }
        pairArr[5] = new Pair("inbox_session_id", str3);
        C20684815ws.LJIILLIIL("inbox_message_cell", C2097608Jq.LJIIJ(pairArr));
    }

    public static final void onCheckedChanged$3(C0P4I c0p4i, CompoundButton compoundButton, boolean z) {
        Map<String, String> map;
        if (Intrinsics.LJFF(((C0OAT) c0p4i.l0).LLILZ, Boolean.TRUE)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            TopicRawInfo topicRawInfo = (TopicRawInfo) c0p4i.l3;
            c2344009Gk.LJFF("movie_id", topicRawInfo.id);
            c2344009Gk.LJFF("movie_title", topicRawInfo.title);
            C20684815ws.LJIILLIIL("movie_trending_list_click", c2344009Gk.LIZ);
        } else {
            C2344009Gk c2344009Gk2 = ((C0OAT) c0p4i.l0).LLILLL;
            if (c2344009Gk2 != null) {
                map = c2344009Gk2.LIZ;
            } else {
                map = null;
            }
            C20684815ws.LJIILLIIL("trending_words_click", map);
        }
        C0HZQ c0hzq = (C0HZQ) c0p4i.l1;
        TopicSearchListAssem.TopicSelectedAbility topicSelectedAbility = ((MovieSearchItemCell) c0p4i.l2).LL;
        if (topicSelectedAbility != null) {
            z = topicSelectedAbility.BI((TopicRawInfo) c0p4i.l3, z);
        }
        c0hzq.setChecked(z);
    }

    public C0P4I(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
