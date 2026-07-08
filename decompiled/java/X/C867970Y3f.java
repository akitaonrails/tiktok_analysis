package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.Participant;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.im.core.proto.ResponseBody;
import com.bytedance.im.core.proto.SetConversationCoreInfoRequestBody;
import com.bytedance.im.core.proto.SetConversationSettingInfoRequestBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoRequestBody;
import com.bytedance.im.core.proto.UpsertConversationCoreExtInfoResponseBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoRequestBody;
import com.bytedance.im.core.proto.UpsertConversationSettingExtInfoResponseBody;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingPersistentExt;
import com.bytedance.im.core.proto.im_biz_ext.BizConvSettingTransientExt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0Y3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867970Y3f extends C863860Xui implements InterfaceC868050Y3n, InterfaceC866540Xz2 {
    public final C0YEM LLILLJJLI;
    public final String LLILLL;
    public final C0Y9J LLILZ;
    public final List<InterfaceC868050Y3n> LLILZIL = new CopyOnWriteArrayList();

    @Override // X.InterfaceC866540Xz2
    public final C0Y8T LIZLLL() {
        return this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJI() {
        ((CopyOnWriteArrayList) this.LLILZIL).clear();
        C868200Y4c c868200Y4c = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ;
        c868200Y4c.getClass();
        c868200Y4c.LJIIIIZZ(this.LLILLL, this);
        LIZ(this.LLILLJJLI.LJIIZILJ().LIZ().LIZ());
    }

    @Override // X.InterfaceC866540Xz2
    public final List<C0YAE> LJLJJLL() {
        C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationModel queryMemberListSync:");
        sbLIZ.append(this.LLILLL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        return this.LLILZ.LJIILIIL().LJIIIIZZ(this.LLILLL);
    }

    @Override // X.InterfaceC868050Y3n
    public final int LLLIIII() {
        int iLLLIIII;
        int i = Integer.MAX_VALUE;
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null && (iLLLIIII = interfaceC868050Y3n.LLLIIII()) < i) {
                i = iLLLIIII;
            }
        }
        if (i == Integer.MAX_VALUE) {
            return 0;
        }
        return i;
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJJJJL(C0Y8T c0y8t) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJJJJJL(c0y8t);
            }
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJJJLL(C914110ZtZ c914110ZtZ) {
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        new C0Y1J(c870180YBsLIZ.LLILLL, c914110ZtZ, true).LJIIL(str);
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJLIIIJ(C0Y8T c0y8t) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJJLIIIJ(c0y8t);
            }
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIL(final String str) {
        final String str2 = this.LLILLL;
        C0Y8T c0y8tLIZ = this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(str2);
        if (c0y8tLIZ != null) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (TextUtils.isEmpty(str)) {
                c0y8tLIZ.setDraftContent(str);
                c0y8tLIZ.setDraftTime(jCurrentTimeMillis);
            }
            this.LLILLJJLI.LIZLLL().LJIIJJI("ConversationModel saveDraft");
            this.LLILLJJLI.LJIIJJI().LIZJ(new InterfaceC872410YKh<Boolean>() { // from class: X.0Y3E
                @Override // X.InterfaceC872410YKh
                public final Boolean LIZ() {
                    return Boolean.valueOf(this.LIZLLL.LLILZ.LJIIJJI().LJJJLL(jCurrentTimeMillis, str2, str));
                }
            }, new InterfaceC864800XwE<Boolean>() { // from class: X.0Y3B
                @Override // X.InterfaceC864800XwE
                public final void LIZ(Boolean bool) {
                    C0Y8T c0y8tLIZ2;
                    Boolean bool2 = bool;
                    if (bool2 != null && bool2.booleanValue() && (c0y8tLIZ2 = this.LIZLLL.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(str2)) != null) {
                        c0y8tLIZ2.setDraftContent(str);
                        c0y8tLIZ2.setDraftTime(jCurrentTimeMillis);
                        this.LIZLLL.LLILLJJLI.LJIIZILJ().LIZLLL().LIZLLL().LJJL(9, c0y8tLIZ2);
                    }
                }
            }, false, this.LLILLJJLI.LJIIL().LIZJ());
        }
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJLJLI(List<C0YAE> list) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJJLJLI(list);
            }
        }
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJLL(List<C0YAE> list) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJJLL(list);
            }
        }
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJJZZI(List<C0YAE> list) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJJZZI(list);
            }
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLIIIL(InterfaceC863600XuI<List<C0YAE>> interfaceC863600XuI) {
        C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationModel queryMemberList:");
        sbLIZ.append(this.LLILLL);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LJIIJJI().LIZIZ(new C914050ZtT(this, 5), new C914020ZtQ(interfaceC863600XuI, this, 0));
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLILLLLZI(C0Y8T c0y8t) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJLILLLLZI(c0y8t);
            }
        }
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLL(C1711306n1 c1711306n1) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJLL(c1711306n1);
            }
        }
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJZI(C0Y8T c0y8t) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJZI(c0y8t);
            }
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLD(InterfaceC863600XuI interfaceC863600XuI) {
        C0Y8T c0y8tLIZ = this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL);
        if (c0y8tLIZ == null) {
            if (interfaceC863600XuI != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "conversation is null";
                interfaceC863600XuI.LIZIZ(c0ymw);
                return;
            }
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        c870180YBsLIZ.getClass();
        C0Y1C c0y1c = new C0Y1C(c870180YBsLIZ.LLILLL, interfaceC863600XuI);
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = c0y8tLIZ.getConversationId();
        c867980Y3g.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c867980Y3g.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        c867980Y3g.LJIIL = 1;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBodyBuild = c867980Y3g.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = setConversationSettingInfoRequestBodyBuild;
        c0y1c.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, c0y8tLIZ.getConversationId(), Boolean.FALSE, "");
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLILZIL(InterfaceC868050Y3n interfaceC868050Y3n) {
        if (interfaceC868050Y3n != null) {
            ((CopyOnWriteArrayList) this.LLILZIL).remove(interfaceC868050Y3n);
        }
        if (((CopyOnWriteArrayList) this.LLILZIL).isEmpty()) {
            C868200Y4c c868200Y4c = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            c868200Y4c.LJIIIIZZ(this.LLILLL, this);
        }
        LIZ(this.LLILLJJLI.LJIIZILJ().LIZ().LIZ());
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIZLLLIL(InterfaceC867020Xzo<String> interfaceC867020Xzo) {
        this.LLILLJJLI.LJIIZILJ().getDomain().LIZJ().LLJIJIL(this.LLILLL, interfaceC867020Xzo);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLJLLL(String str) {
        this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZLLL().LJJL(18, this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(str));
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLLIIIL(InterfaceC868050Y3n interfaceC868050Y3n) {
        if (((CopyOnWriteArrayList) this.LLILZIL).isEmpty()) {
            C868200Y4c c868200Y4c = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ;
            c868200Y4c.getClass();
            c868200Y4c.LJIILIIL(this.LLILLL, this);
        }
        if (interfaceC868050Y3n != null && !((CopyOnWriteArrayList) this.LLILZIL).contains(interfaceC868050Y3n)) {
            ((CopyOnWriteArrayList) this.LLILZIL).add(interfaceC868050Y3n);
        }
    }

    public C867970Y3f(C0YEM c0yem, String str) {
        this.LLILLJJLI = c0yem;
        this.LLILZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ();
        this.LLILLL = str;
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJJJL(C873240YNm c873240YNm, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        this.LLILLJJLI.LJIIZILJ().getDomain().LIZJ().LJLJI(c873240YNm, interfaceC867020Xzo);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIIIJLLLLLLLZ(Map<String, String> map, final InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        final C0YEM c0yem = c870180YBsLIZ.LLILLL;
        AbstractC867440Y1e<C0Y8T> abstractC867440Y1e = new AbstractC867440Y1e<C0Y8T>(c0yem, interfaceC863600XuI) { // from class: X.0Y1E
            @Override // X.AbstractC867440Y1e
            public final boolean LJIIIIZZ(C0YIN c0yin) {
                UpsertConversationCoreExtInfoResponseBody upsertConversationCoreExtInfoResponseBody;
                Integer num;
                ResponseBody responseBody = c0yin.LLIZ.body;
                if (responseBody != null && (upsertConversationCoreExtInfoResponseBody = responseBody.upsert_conversation_core_ext_info_body) != null && (num = upsertConversationCoreExtInfoResponseBody.status) != null && num.intValue() == C0YOD.OP_SUCCEED.getValue() && c0yin.LLIZ.body.upsert_conversation_core_ext_info_body.core_info != null) {
                    return true;
                }
                return false;
            }

            {
                int value = C0YMR.UPSERT_CONVERSATION_CORE_EXT_INFO.getValue();
            }

            @Override // X.AbstractC867440Y1e
            public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                String str2 = (String) c0yin.LLILZIL[0];
                if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
                    this.LIZJ.LJIIJJI().LIZIZ(new C914060ZtU(this, str2, c0yin.LLIZ.body.upsert_conversation_core_ext_info_body.core_info, 6), new C914020ZtQ(c0y1g, this, 13));
                } else {
                    LIZ(c0yin);
                    c0y1g.run();
                }
            }
        };
        if (map != null) {
            C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
            if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "conversation is null";
                abstractC867440Y1e.LIZIZ(c0ymw);
                return;
            }
            C868010Y3j c868010Y3j = new C868010Y3j();
            c868010Y3j.LIZLLL = str;
            c868010Y3j.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
            c868010Y3j.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
            C1516540pZE.LIZIZ(map);
            c868010Y3j.LJI = map;
            UpsertConversationCoreExtInfoRequestBody upsertConversationCoreExtInfoRequestBodyBuild = c868010Y3j.build();
            C1ES0 c1es0 = new C1ES0();
            c1es0.LJJJIL = upsertConversationCoreExtInfoRequestBodyBuild;
            abstractC867440Y1e.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str);
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIIJ(Map<String, String> map, Runnable runnable) {
        String str = this.LLILLL;
        C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationModel updateLocal, conversationId:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LJIIJJI().LIZIZ(new C914060ZtU(this, str, map, 0), new C914030ZtR(runnable, 3));
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJZZIII(Map map, final C914110ZtZ c914110ZtZ) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        final C0YEM c0yem = c870180YBsLIZ.LLILLL;
        AbstractC867440Y1e<C0Y8T> abstractC867440Y1e = new AbstractC867440Y1e<C0Y8T>(c0yem, c914110ZtZ) { // from class: X.0Y1D
            @Override // X.AbstractC867440Y1e
            public final boolean LJIIIIZZ(C0YIN c0yin) {
                UpsertConversationSettingExtInfoResponseBody upsertConversationSettingExtInfoResponseBody;
                Integer num;
                ResponseBody responseBody = c0yin.LLIZ.body;
                if (responseBody != null && (upsertConversationSettingExtInfoResponseBody = responseBody.upsert_conversation_setting_ext_info_body) != null && (num = upsertConversationSettingExtInfoResponseBody.status) != null && num.intValue() == C0YOD.OP_SUCCEED.getValue() && c0yin.LLIZ.body.upsert_conversation_setting_ext_info_body.setting_info != null) {
                    return true;
                }
                return false;
            }

            {
                int value = C0YMR.UPSERT_CONVERSATION_SETTING_EXT_INFO.getValue();
            }

            @Override // X.AbstractC867440Y1e
            public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                String str2 = (String) c0yin.LLILZIL[0];
                if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
                    this.LIZJ.LJIIJJI().LIZIZ(new C914060ZtU(this, str2, c0yin.LLIZ.body.upsert_conversation_setting_ext_info_body.setting_info, 7), new C914020ZtQ(c0y1g, this, 14));
                } else {
                    LIZ(c0yin);
                    c0y1g.run();
                }
            }
        };
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        C868030Y3l c868030Y3l = new C868030Y3l();
        c868030Y3l.LIZLLL = str;
        c868030Y3l.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c868030Y3l.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        C1516540pZE.LIZIZ(map);
        c868030Y3l.LJI = map;
        UpsertConversationSettingExtInfoRequestBody upsertConversationSettingExtInfoRequestBodyBuild = c868030Y3l.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJI = upsertConversationSettingExtInfoRequestBodyBuild;
        abstractC867440Y1e.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJL(boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1C c0y1c = new C0Y1C(c0yem, interfaceC863600XuI);
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            c0y1c.LIZIZ(c0ymw);
            return;
        }
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = str;
        c867980Y3g.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c867980Y3g.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        c867980Y3g.LJII = Boolean.valueOf(z);
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBodyBuild = c867980Y3g.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = setConversationSettingInfoRequestBodyBuild;
        c0y1c.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str, Boolean.FALSE, "s:mute");
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLI(String str, List<C0YAE> list) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJLI(str, list);
            }
        }
    }

    @Override // X.InterfaceC868050Y3n
    public final void LJLJI(int i, C0Y8T c0y8t) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LJLJI(i, c0y8t);
            }
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLJJI(boolean z, InterfaceC867020Xzo<String> interfaceC867020Xzo) {
        this.LLILLJJLI.LJIIZILJ().getDomain().LIZJ().LJJLI(this.LLILLL, z, interfaceC867020Xzo);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLJJL(String str, C914150Ztd c914150Ztd) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str2 = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1F c0y1f = new C0Y1F(c0yem, c914150Ztd);
        HashMap map = new HashMap();
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str2);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str2, true)) == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            c0y1f.LIZIZ(c0ymw);
            return;
        }
        C868120Y3u c868120Y3u = new C868120Y3u();
        c868120Y3u.LIZLLL = str2;
        c868120Y3u.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c868120Y3u.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        C1516540pZE.LIZIZ(map);
        c868120Y3u.LJIILJJIL = map;
        c868120Y3u.LJI = str;
        c868120Y3u.LJIIJ = Boolean.TRUE;
        SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBodyBuild = c868120Y3u.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJI = setConversationCoreInfoRequestBodyBuild;
        c0y1f.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str2, "s:name");
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLJL(final String str, InterfaceC863600XuI<List<C0YAE>> interfaceC863600XuI) {
        C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationModel queryGroupManagerList:");
        sbLIZ.append(str);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str) && interfaceC863600XuI != null) {
            this.LLILLJJLI.LJIIJJI().LIZIZ(new InterfaceC872410YKh<List<C0YAE>>() { // from class: X.0Y3C
                @Override // X.InterfaceC872410YKh
                public final List<C0YAE> LIZ() {
                    return this.LIZIZ.LLILZ.LJIILIIL().LJFF(str);
                }
            }, new C914030ZtR(interfaceC863600XuI, 4));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJLLL(boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1C c0y1c = new C0Y1C(c0yem, interfaceC863600XuI);
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            c0y1c.LIZIZ(c0ymw);
            return;
        }
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = str;
        c867980Y3g.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c867980Y3g.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        c867980Y3g.LJI = Boolean.valueOf(z);
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBodyBuild = c867980Y3g.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = setConversationSettingInfoRequestBodyBuild;
        RequestBody requestBodyBuild = c1es0.build();
        int inboxType = c0y8tLIZ.getInboxType();
        Object[] objArr = new Object[3];
        boolean z2 = false;
        objArr[0] = str;
        if (c0yem.LJIIIZ().LJIILLIIL && z) {
            z2 = true;
        }
        objArr[1] = Boolean.valueOf(z2);
        objArr[2] = "s:stick_on_top";
        c0y1c.LJIIIZ(inboxType, requestBodyBuild, null, objArr);
    }

    @Override // X.InterfaceC866540Xz2
    public final boolean LJZL(String str, Map<String, String> map) {
        return this.LLILZ.LJIIJJI().LJJL(str, map);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LL(EnumC868530Y5j enumC868530Y5j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            if (interfaceC863600XuI != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "conversation is null";
                interfaceC863600XuI.LIZIZ(c0ymw);
                return;
            }
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1C c0y1c = new C0Y1C(c0yem, interfaceC863600XuI);
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
            C0YMW c0ymw2 = C0YMW.newBuilder().LIZ;
            c0ymw2.statusMsg = "conversation is null";
            c0y1c.LIZIZ(c0ymw2);
            return;
        }
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = str;
        c867980Y3g.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c867980Y3g.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        c867980Y3g.LJIIIZ = enumC868530Y5j;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBodyBuild = c867980Y3g.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = setConversationSettingInfoRequestBodyBuild;
        c0y1c.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str, Boolean.FALSE, "s:category");
    }

    @Override // X.InterfaceC868050Y3n
    public final void LLIIII(int i, String str) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LLIIII(i, str);
            }
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLILL(Map<String, String> map, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1F c0y1f = new C0Y1F(c0yem, interfaceC863600XuI);
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            c0y1f.LIZIZ(c0ymw);
            return;
        }
        C868120Y3u c868120Y3u = new C868120Y3u();
        c868120Y3u.LIZLLL = str;
        c868120Y3u.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c868120Y3u.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        C1516540pZE.LIZIZ(map);
        c868120Y3u.LJIILJJIL = map;
        SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBodyBuild = c868120Y3u.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJI = setConversationCoreInfoRequestBodyBuild;
        c0y1f.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str, null);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJL(List<Long> list, Map<String, String> map, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        this.LLILLJJLI.LJIIZILJ().getDomain().LIZJ().LLJILJIL(this.LLILLL, list, map, interfaceC867020Xzo);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJLIIIJL(final String str, final String str2, InterfaceC863600XuI<C0YAE> interfaceC863600XuI) {
        C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationModel queryMember, conversationId:");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", uid:");
        sbLIZ.append(str2);
        c868780Y6iLIZLLL.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && interfaceC863600XuI != null) {
            this.LLILLJJLI.LJIIJJI().LIZIZ(new InterfaceC872410YKh<C0YAE>() { // from class: X.0Y3D
                @Override // X.InterfaceC872410YKh
                public final C0YAE LIZ() {
                    return this.LIZJ.LLILZ.LJIILIIL().LJIIJ(str, str2);
                }
            }, new C914030ZtR(interfaceC863600XuI, 5));
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LJJZ(BizConvSettingPersistentExt bizConvSettingPersistentExt, BizConvSettingTransientExt bizConvSettingTransientExt, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1C c0y1c = new C0Y1C(c0yem, interfaceC863600XuI);
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            c0y1c.LIZIZ(c0ymw);
            return;
        }
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = str;
        c867980Y3g.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c867980Y3g.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        c867980Y3g.LJIILJJIL = bizConvSettingPersistentExt;
        c867980Y3g.LJIILL = bizConvSettingTransientExt;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBodyBuild = c867980Y3g.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = setConversationSettingInfoRequestBodyBuild;
        c0y1c.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str, Boolean.FALSE, "");
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIFFJFJJ(boolean z, Map<String, String> map, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1C c0y1c = new C0Y1C(c0yem, interfaceC863600XuI);
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            c0y1c.LIZIZ(c0ymw);
            return;
        }
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = str;
        c867980Y3g.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c867980Y3g.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        c867980Y3g.LJII = Boolean.valueOf(z);
        C1516540pZE.LIZIZ(map);
        c867980Y3g.LJIILIIL = map;
        SetConversationSettingInfoRequestBody setConversationSettingInfoRequestBodyBuild = c867980Y3g.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = setConversationSettingInfoRequestBodyBuild;
        c0y1c.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str, Boolean.FALSE, "");
    }

    @Override // X.InterfaceC868050Y3n
    public final void LLIILZL(int i, String str, List list) {
        for (InterfaceC868050Y3n interfaceC868050Y3n : (CopyOnWriteArrayList) this.LLILZIL) {
            if (interfaceC868050Y3n != null) {
                interfaceC868050Y3n.LLIILZL(i, str, list);
            }
        }
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLLIL(long j, C862540Xsa c862540Xsa, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        this.LLILLJJLI.LJIIZILJ().getDomain().LIZJ().LJJJJZ(this.LLILLL, j, c862540Xsa, interfaceC867020Xzo);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIILII(List<Long> list, int i, Map<String, String> map, final InterfaceC863600XuI<BatchUpdateConversationParticipantResponseBody> interfaceC863600XuI) {
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        final C0YEM c0yem = c870180YBsLIZ.LLILLL;
        AbstractC867440Y1e<BatchUpdateConversationParticipantResponseBody> abstractC867440Y1e = new AbstractC867440Y1e<BatchUpdateConversationParticipantResponseBody>(c0yem, interfaceC863600XuI) { // from class: X.0Y11
            @Override // X.AbstractC867440Y1e
            public final boolean LJIIIIZZ(C0YIN c0yin) {
                ResponseBody responseBody = c0yin.LLIZ.body;
                if (responseBody != null && responseBody.batch_update_conversation_participant_body != null) {
                    return true;
                }
                return false;
            }

            {
                int value = C0YMR.BATCH_UPDATE_CONVERSATION_PARTICIPANT.getValue();
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.AbstractC867440Y1e
            public final void LJII(C0YIN c0yin, C0Y1G c0y1g) {
                Participant participant;
                String str2 = (String) c0yin.LLILZIL[0];
                if (c0yin.LJIIJJI() && LJIIIIZZ(c0yin)) {
                    BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody = c0yin.LLIZ.body.batch_update_conversation_participant_body;
                    List<UpdateConversationParticipantResult> list2 = batchUpdateConversationParticipantResponseBody.success_participants;
                    if (list2 != null && !list2.isEmpty()) {
                        ArrayList arrayList = new ArrayList();
                        for (UpdateConversationParticipantResult updateConversationParticipantResult : list2) {
                            if (updateConversationParticipantResult != null && (participant = updateConversationParticipantResult.participant) != null) {
                                arrayList.add(C0Y8V.LJI(str2, participant));
                            }
                        }
                        this.LIZJ.LJIIJJI().LIZIZ(new C914060ZtU(this, str2, arrayList, 8), new C914020ZtQ(arrayList, this, 15));
                    }
                    InterfaceC863600XuI<T> interfaceC863600XuI2 = this.LIZIZ;
                    if (interfaceC863600XuI2 != 0) {
                        try {
                            if (interfaceC863600XuI2 instanceof InterfaceC863560XuE) {
                                ((InterfaceC863560XuE) interfaceC863600XuI2).LJ(batchUpdateConversationParticipantResponseBody, null);
                                return;
                            } else {
                                interfaceC863600XuI2.onSuccess((T) batchUpdateConversationParticipantResponseBody);
                                return;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LIZJ.getEventTracker().LJ(e);
                            return;
                        }
                    }
                    return;
                }
                LIZ(c0yin);
            }
        };
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null) {
            abstractC867440Y1e.LIZ(C0YIN.LJFF(c0yem, -1017));
            return;
        }
        if (list != null && !list.isEmpty()) {
            C867990Y3h c867990Y3h = new C867990Y3h();
            c867990Y3h.LIZLLL = str;
            c867990Y3h.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
            c867990Y3h.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
            C1516540pZE.LIZ(list);
            c867990Y3h.LJI = list;
            c867990Y3h.LJII = Integer.valueOf(i);
            if (map != null) {
                C1516540pZE.LIZIZ(map);
                c867990Y3h.LJIIIIZZ = map;
            }
            C1ES0 c1es0 = new C1ES0();
            c1es0.LJJIJIL = c867990Y3h.build();
            abstractC867440Y1e.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str);
            return;
        }
        abstractC867440Y1e.LIZ(C0YIN.LJFF(c0yem, -1015));
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLILLJJLI(List<String> list, List<String> list2, Boolean bool, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            if (interfaceC863600XuI != null) {
                C0YMW c0ymw = C0YMW.newBuilder().LIZ;
                c0ymw.statusMsg = "conversation is null";
                interfaceC863600XuI.LIZIZ(c0ymw);
                return;
            }
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1C c0y1c = new C0Y1C(c0yem, interfaceC863600XuI);
        if (list.isEmpty() && list2.isEmpty() && bool == null) {
            C0YMW c0ymw2 = C0YMW.newBuilder().LIZ;
            c0ymw2.statusMsg = "nothing to change";
            c0y1c.LIZIZ(c0ymw2);
            return;
        }
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str, true)) == null) {
            C0YMW c0ymw3 = C0YMW.newBuilder().LIZ;
            c0ymw3.statusMsg = "conversation is null";
            c0y1c.LIZIZ(c0ymw3);
            return;
        }
        C867980Y3g c867980Y3g = new C867980Y3g();
        c867980Y3g.LIZLLL = str;
        c867980Y3g.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c867980Y3g.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        if (!list.isEmpty()) {
            C1516540pZE.LIZ(list);
            c867980Y3g.LJIIJJI = list;
        }
        if (!list2.isEmpty()) {
            C1516540pZE.LIZ(list2);
            c867980Y3g.LJIIJ = list2;
        }
        if (bool != null) {
            c867980Y3g.LJI = bool;
        }
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJJ = c867980Y3g.build();
        c0y1c.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str, Boolean.FALSE, "");
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLIZ(long j, int i, Map<String, String> map, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        this.LLILLJJLI.LJIIZILJ().getDomain().LIZJ().LJJJZ(this.LLILLL, j, i, map, interfaceC867020Xzo);
    }

    @Override // X.InterfaceC866540Xz2
    public final void LLJJJJJIL(String str, String str2, String str3, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        if (this.LLILLJJLI.LJIIZILJ().LIZLLL().LIZ().LIZ(this.LLILLL) == null) {
            return;
        }
        C870180YBs c870180YBsLIZ = this.LLILLJJLI.LJIIZILJ().getDomain().LIZ();
        String str4 = this.LLILLL;
        c870180YBsLIZ.getClass();
        C0YEM c0yem = c870180YBsLIZ.LLILLL;
        C0Y1F c0y1f = new C0Y1F(c0yem, interfaceC863600XuI);
        C0Y8T c0y8tLIZ = c0yem.LJIIZILJ().LIZLLL().LIZ().LIZ(str4);
        if (c0y8tLIZ == null && (c0y8tLIZ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJIIJJI().LIZ(str4, true)) == null) {
            C0YMW c0ymw = C0YMW.newBuilder().LIZ;
            c0ymw.statusMsg = "conversation is null";
            c0y1f.LIZIZ(c0ymw);
            return;
        }
        C868120Y3u c868120Y3u = new C868120Y3u();
        c868120Y3u.LIZLLL = str4;
        c868120Y3u.LJ = Long.valueOf(c0y8tLIZ.getConversationShortId());
        c868120Y3u.LJFF = Integer.valueOf(c0y8tLIZ.getConversationType());
        if (str != null) {
            c868120Y3u.LJI = str;
            c868120Y3u.LJIIJ = Boolean.TRUE;
        }
        if (str2 != null && !str2.isEmpty()) {
            c868120Y3u.LJIIIIZZ = str2;
            c868120Y3u.LJIIL = Boolean.TRUE;
        }
        if (str3 != null) {
            c868120Y3u.LJII = str3;
            c868120Y3u.LJIIJJI = Boolean.TRUE;
        }
        SetConversationCoreInfoRequestBody setConversationCoreInfoRequestBodyBuild = c868120Y3u.build();
        C1ES0 c1es0 = new C1ES0();
        c1es0.LJJJI = setConversationCoreInfoRequestBodyBuild;
        c0y1f.LJIIIZ(c0y8tLIZ.getInboxType(), c1es0.build(), null, str4, "s:name");
    }
}
