package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.AISummaryMessage;
import com.bytedance.android.livesdk.model.message.MultiLangContent;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00jX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C160900jX extends AbstractC1110800f0o<AISummaryMessage> {
    public final AtomicBoolean LJJI;
    public final String LJJIFFI;

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final int LIZLLL() {
        return R.raw.icon_ai_library;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final int LJIJI() {
        return 0;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJJJ() {
        return false;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final int LJLJJL() {
        return 1;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJLZ() {
        return true;
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 8;
    }

    @Override // X.AbstractC1110800f0o
    public final boolean LLJL() {
        return true;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return null;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final boolean LJIIZILJ() {
        return ((AISummaryMessage) this.LJIL).requireStay;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112570f3f
    public final long LJJII() {
        return ((AISummaryMessage) this.LJIL).stayDurationMs;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJLLILLLL() {
        return ((AISummaryMessage) this.LJIL).requireStay;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
    public final ImageModel LJLLLLLL() {
        return ((AISummaryMessage) this.LJIL).icon;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        List<MultiLangContent> list = ((AISummaryMessage) this.LJIL).multiLangSummaryList;
        ArrayList arrayList = new ArrayList();
        for (MultiLangContent multiLangContent : list) {
            if (Intrinsics.LJFF(multiLangContent.language, this.LJJIFFI)) {
                arrayList.add(multiLangContent);
            }
        }
        MultiLangContent multiLangContent2 = (MultiLangContent) C13LP.LJJJLZIJ(0, arrayList);
        String str = multiLangContent2 != null ? multiLangContent2.content : null;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        MultiLangContent multiLangContent3 = (MultiLangContent) C13LP.LJJJLZIJ(0, ((AISummaryMessage) this.LJIL).multiLangSummaryList);
        if (multiLangContent3 != null) {
            return multiLangContent3.content;
        }
        return null;
    }

    @Override // X.AbstractC1110800f0o
    public final String LLJJJJ() {
        return super.LLJJJJ();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final int getColor() {
        return LJIIL();
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        String string;
        Object next;
        DataChannel dataChannel;
        super.onAttach();
        if (LLIILII() && !LLIIIILZ().LJJ && this.LJJI.compareAndSet(false, true)) {
            ArrayList arrayList = new ArrayList();
            CharSequence charSequenceLLFF = LLFF();
            if (charSequenceLLFF != null) {
                string = charSequenceLLFF.toString();
                if (string != null) {
                    arrayList.add(string);
                }
            } else {
                string = null;
            }
            String str = ((AISummaryMessage) this.LJIL).clickTitleSchemeLink;
            if (str != null) {
                try {
                    List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6);
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
                        if (listLJJLIIIJILLIZJL2.size() == 2) {
                            arrayList2.add(listLJJLIIIJILLIZJL2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it3.next();
                            if (Intrinsics.LJFF(C13LP.LJJJJZI((List) next), "result_key")) {
                                break;
                            }
                        }
                    }
                    List list = (List) next;
                    if (list != null) {
                        String str2 = (String) list.get(1);
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            if ((!arrayList.isEmpty()) && (dataChannel = LLIIIILZ().LJIIIZ) != null) {
                dataChannel.SX0(C0TZE.class, arrayList);
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_summary_send");
            c474500IjALIZ.LJIJJLI(LLIIIILZ().LJIIIZ);
            c474500IjALIZ.LJJII(Long.valueOf(C158B.LIZ()), "generate_live_time");
            c474500IjALIZ.LJJII(string, "ai_summary_content");
            c474500IjALIZ.LIZ();
        }
    }

    public C160900jX(AISummaryMessage aISummaryMessage) {
        super(aISummaryMessage);
        this.LJJI = new AtomicBoolean(false);
        this.LJJIFFI = C786410Ut5.t2(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).currentLocale());
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1133840fby
    public final CharSequence LJLIL(User user) {
        return super.LJLIL(user);
    }

    public final String LLJLIL(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1011705662) {
            if (iHashCode != -326696768) {
                if (iHashCode == 1685980385 && str.equals("click_title") && !LLIILII()) {
                    return ((AISummaryMessage) this.LJIL).clickTitleSchemeLink;
                }
                return null;
            }
            if (str.equals("long_press")) {
                return ((AISummaryMessage) this.LJIL).longPressAreaSchemeLink;
            }
            return null;
        }
        if (str.equals("click_content")) {
            return ((AISummaryMessage) this.LJIL).clickContentSchemeLink;
        }
        return null;
    }
}
