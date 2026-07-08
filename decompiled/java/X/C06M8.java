package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.IQuickChatRoomSheetFactory;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06M8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06M8 extends C06O6<C06OO> {
    public final C1600706On LLILZ;
    public final C06OC LLILZIL;
    public final Set<EnumC1596306Mv> LLILZLL;
    public final Set<C067L> LLIZ;

    @Override // X.C06O6
    public final boolean LIZLLL() {
        return true;
    }

    public final String LJIIL() {
        String conversationId;
        Map<String, String> localExt;
        SessionInfo sessionInfo = this.LLILZ.LJI;
        if (sessionInfo != null && (conversationId = sessionInfo.getConversationId()) != null) {
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(conversationId);
            String str = (c0y8tLIZ == null || (localExt = c0y8tLIZ.getLocalExt()) == null) ? null : localExt.get("chat_unavailable_notice_code");
            if (str != null && str.length() != 0) {
                return str;
            }
            String strLJFF = C0YNP.LJFF(conversationId, "chat_unavailable_notice_code");
            if (strLJFF != null && strLJFF.length() > 0) {
                return strLJFF;
            }
        }
        return null;
    }

    @Override // X.AnonymousClass0684
    public final Set<EnumC1596306Mv> LIZIZ() {
        return this.LLILZLL;
    }

    @Override // X.C06O6
    public final C067K LJI() {
        return this.LLILZIL;
    }

    @Override // X.C06O6
    public final Set<C067L> LJII() {
        return this.LLIZ;
    }

    public C06M8(C1600706On c1600706On) {
        super(c1600706On);
        this.LLILZ = c1600706On;
        this.LLILZIL = new C06OC(R.layout.cfs);
        this.LLILZLL = C13LQ.LJLIIL(new EnumC1596306Mv[]{EnumC1596306Mv.CHAT_UNAVAILABLE_ACCOUNT, EnumC1596306Mv.CHAT_UNAVAILABLE_DM});
        this.LLIZ = C13LQ.LJLIIL(new C067L[]{C067L.SINGLE, C067L.BUSINESS});
    }

    @Override // X.C06O6
    public final void LJIIIZ(C06OO c06oo) {
        C06MI c06mi;
        View view = this.LLILLL;
        if ((view instanceof C06MI) && (c06mi = (C06MI) view) != null && c06mi.getVisibility() == 0) {
            c06mi.LL.LIZ(c06mi);
            c06mi.LLZLI();
        }
    }

    @Override // X.C06O6
    public final Object LJIIIIZZ(C06OO c06oo, InterfaceC1364105Vn<? super C06OJ> interfaceC1364105Vn) {
        String str;
        if (c06oo.LIZ.isDebugMode()) {
            return C06OI.LIZ;
        }
        int i = C069L.LIZ[c06oo.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Unsupported template ");
                sbLIZ.append(c06oo.LIZ);
                return new C06OH(C2188811AlT.LIZIZ(sbLIZ));
            }
            str = "chat_unavailable_dm";
        } else {
            str = "chat_unavailable_account";
        }
        String strLJIIL = LJIIL();
        boolean zLJFF = Intrinsics.LJFF(strLJIIL, str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isValid: templateId=");
        sbLIZ2.append(c06oo.LIZ);
        sbLIZ2.append(", cachedCode=");
        sbLIZ2.append(strLJIIL);
        sbLIZ2.append(", expected=");
        sbLIZ2.append(str);
        sbLIZ2.append(", result=");
        sbLIZ2.append(zLJFF);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (zLJFF) {
            return C06OI.LIZ;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Cached code ");
        sbLIZ3.append(strLJIIL);
        sbLIZ3.append(" != expected ");
        sbLIZ3.append(str);
        return new C06OH(C2188811AlT.LIZIZ(sbLIZ3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.06Ol] */
    @Override // X.C06O6
    public final Object LJIIJ(C06OO c06oo, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        String conversationId;
        C06MI c06mi;
        String strLJIIL = LJIIL();
        if (strLJIIL == null) {
            return Unit.LIZ;
        }
        SessionInfo sessionInfo = this.LLILZ.LJI;
        if (sessionInfo != null && (conversationId = sessionInfo.getConversationId()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onShow: noticeCode=");
            sbLIZ.append(strLJIIL);
            sbLIZ.append(", conversationId=");
            sbLIZ.append(conversationId);
            C2188811AlT.LIZIZ(sbLIZ);
            View view = this.LLILLL;
            if ((view instanceof C06MI) && (c06mi = (C06MI) view) != 0) {
                ((ArrayList) c06mi.LL.LLILLJJLI).add(this.LLILZ.LJIIIZ.getValue());
                c06mi.LIZ(conversationId, strLJIIL, new C06ML() { // from class: X.06Ol
                    @Override // X.C06ML
                    public final void LIZJ() {
                        InterfaceC214902198i interfaceC214902198i;
                        FragmentManager supportFragmentManager;
                        IQuickChatRoomSheetFactory iQuickChatRoomSheetFactory;
                        C1600706On c1600706On = this.LIZ.LLILZ;
                        C19EG c19eg = c1600706On.LIZLLL;
                        if (c1600706On.LJII) {
                            if (c19eg == null || (supportFragmentManager = c19eg.getSupportFragmentManager()) == null || (iQuickChatRoomSheetFactory = (IQuickChatRoomSheetFactory) PluggableExtentionKt.pluggableSpiForReal(IQuickChatRoomSheetFactory.class)) == null) {
                                return;
                            }
                            iQuickChatRoomSheetFactory.LIZ(supportFragmentManager);
                            return;
                        }
                        C128Y c128y = c1600706On.LJ;
                        if (!(c128y instanceof InterfaceC214902198i)) {
                            if (C06W7.LIZIZ(c19eg)) {
                                c19eg.finish();
                            }
                        } else {
                            if (!(c128y instanceof InterfaceC214902198i) || (interfaceC214902198i = (InterfaceC214902198i) c128y) == null) {
                                return;
                            }
                            interfaceC214902198i.finish();
                        }
                    }
                });
                if (c06mi.getVisibility() == 8) {
                    int visibility = c06mi.getVisibility();
                    c06mi.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c06mi);
                    c06mi.LJIILIIL();
                }
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }
}
