package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenChatRoomModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.tools.chat.common.save.IAiChatFileService;
import com.ss.android.ugc.tools.chat.room.api.AiChatRoomFeatureApi;
import com.ss.android.ugc.tools.data.ConfirmModal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS111S1200000_28;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS9S1500000_32;

/* JADX INFO: renamed from: X.18WR, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18WR extends AbstractC2255721DQs<C18VN> implements C18VN, InterfaceC379610EuV {
    public static final C18WW LLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final InterfaceC497601wk LLILLJJLI = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1430910nL7.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(442));
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
    public final ConcurrentHashMap<String, C05YD<InterfaceC1157570gEF<String>>> LLILZLL = new ConcurrentHashMap<>();
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), AiChatRoomFeatureApi.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C18UJ.class, null);
    public DialogC1390150mHN LLJ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.18WW] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C18WR.class, "aiChatProtocolApi", "getAiChatProtocolApi()Lcom/ss/android/ugc/tools/chat/common/api/AiChatProtocolApi;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C18WR.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C2217381BqS(C18WR.class, "aiChatRoomFeatureApi", "getAiChatRoomFeatureApi()Lcom/ss/android/ugc/tools/chat/room/api/AiChatRoomFeatureApi;", 0), new C2217381BqS(C18WR.class, "chatSession", "getChatSession()Lcom/ss/android/ugc/tools/chat/room/model/ChatSession;", 0)};
        LLJI = new Object() { // from class: X.18WW
        };
        LLJILJIL = 8;
    }

    public C18VN w2() {
        return this;
    }

    private final InterfaceC1430910nL7 Z1() {
        return (InterfaceC1430910nL7) this.LLILLL.getValue(this, LLJIJIL[0]);
    }

    public final C18UJ G2() {
        return (C18UJ) this.LLIZLLLIL.getValue(this, LLJIJIL[3]);
    }

    public final IAiChatFileService H2() {
        return (IAiChatFileService) this.LLILZ.getValue();
    }

    public final C19EG T2() {
        return (C19EG) this.LLILZIL.getValue(this, LLJIJIL[1]);
    }

    public final void W2() {
        DialogC1390150mHN dialogC1390150mHN = this.LLJ;
        if (dialogC1390150mHN != null) {
            dialogC1390150mHN.dismiss();
            C785410UrT.LIZ(dialogC1390150mHN);
        }
        this.LLJ = null;
    }

    public final AiChatRoomFeatureApi o2() {
        return (AiChatRoomFeatureApi) this.LLIZ.getValue(this, LLJIJIL[2]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LLILLJJLI, null);
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        w2();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public C18WR(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> co(String str) {
        C05YD<InterfaceC1157570gEF<String>> c05ydPutIfAbsent;
        ConcurrentHashMap<String, C05YD<InterfaceC1157570gEF<String>>> concurrentHashMap = this.LLILZLL;
        C05YD<InterfaceC1157570gEF<String>> c05ydLIZ = concurrentHashMap.get(str);
        if (c05ydLIZ == null && (c05ydPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c05ydLIZ = C1BNE.LIZ(C1157780gEa.LIZ)))) != null) {
            c05ydLIZ = c05ydPutIfAbsent;
        }
        return c05ydLIZ;
    }

    public final void X1(String str, AIChatGenNode aIChatGenNode) {
        String str2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (((C18WU) Z1().as0(C18WU.class)).LIZIZ()) {
            C01TT.LIZLLL(new AwS147S1200000_32(this, str, aIChatGenNode, 6));
            return;
        }
        AIChatGenChatRoomModel aIChatGenChatRoomModel = G2().LJ.chatRoomModel;
        if (aIChatGenChatRoomModel != null && (str2 = aIChatGenChatRoomModel.creationId) != null) {
            String path = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIILLIIL(new CreativeInfo(str2, 0, null, 6, null), EnumC20228214Cy.AI_CHAT, "", true).getPath();
            Path path2 = Paths.get(str, new String[0]);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(path);
            sbLIZ.append('/');
            sbLIZ.append(C08PN.LIZ(path2));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            BitmapFactory.decodeFile(str, options);
            Boolean bool = null;
            if (!C2354709Kn.LIZLLL(str, strLIZIZ)) {
                C21290818Tq.LIZIZ("AiChatSaveComponent", "doPostAction: copyFile failed", null);
            }
            int i = options.outWidth;
            int i2 = options.outHeight;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("download file success: ");
            sbLIZ2.append(str);
            sbLIZ2.append(" , creativePath: ");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", width: ");
            sbLIZ2.append(i);
            sbLIZ2.append(", height: ");
            sbLIZ2.append(i2);
            C21290818Tq.LIZ("AiChatSaveComponent", C2188811AlT.LIZIZ(sbLIZ2));
            AiChatRoomFeatureApi aiChatRoomFeatureApiO2 = o2();
            if (aiChatRoomFeatureApiO2 != null) {
                AIChatGenChatRoomModel aIChatGenChatRoomModel2 = G2().LJ.chatRoomModel;
                if (aIChatGenChatRoomModel2 != null) {
                    bool = aIChatGenChatRoomModel2.isNewUser;
                }
                aiChatRoomFeatureApiO2.rE0(C18UO.LIZJ(aIChatGenNode, strLIZIZ, i, i2, bool));
                return;
            }
            return;
        }
        throw new RuntimeException("creation id must non-null");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, X.0mTF, X.0mTX] */
    public final void c3(String str, AIChatGenNode aIChatGenNode) {
        int i;
        int i2;
        C18WU c18wu = (C18WU) Z1().as0(C18WU.class);
        if (c18wu.LIZLLL()) {
            ConfirmModal confirmModalLIZJ = c18wu.LIZJ();
            C259800zU c259800zU = new C259800zU();
            C1397580mTM c1397580mTM = new C1397580mTM(T2());
            C19EG c19egT2 = T2();
            if (confirmModalLIZJ != null) {
                i = confirmModalLIZJ.titleResId;
            } else {
                i = 0;
            }
            c1397580mTM.LJI(c19egT2.getString(i));
            C19EG c19egT22 = T2();
            if (confirmModalLIZJ != null) {
                i2 = confirmModalLIZJ.detailResId;
            } else {
                i2 = 0;
            }
            c1397580mTM.LIZIZ(c19egT22.getString(i2));
            C985403tE.LIZ(c1397580mTM, new AwS9S1500000_32(this, (C18WR) confirmModalLIZJ, (ConfirmModal) str, (String) aIChatGenNode, (AIChatGenNode) c18wu, (C18WU) c259800zU, (C259800zU<C1397510mTF>) 0));
            c1397580mTM.LJII = false;
            ?? c1397510mTF = new C1397510mTF(c1397580mTM);
            c259800zU.element = c1397510mTF;
            c1397510mTF.LIZLLL();
            return;
        }
        W1(str, aIChatGenNode, c18wu);
    }

    public final void W1(String str, AIChatGenNode aIChatGenNode, C18WU c18wu) {
        Boolean bool;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        AIChatGenChatRoomModel aIChatGenChatRoomModel = G2().LJ.chatRoomModel;
        if (aIChatGenChatRoomModel != null) {
            bool = aIChatGenChatRoomModel.isNewUser;
        } else {
            bool = null;
        }
        c18wu.LIZ(Z1().NX(), C18UO.LIZJ(aIChatGenNode, str, i, i2, bool));
    }

    public final void i3(Context context, final C09AE c09ae, float f) {
        DialogC1390150mHN dialogC1390150mHN = this.LLJ;
        if (dialogC1390150mHN == null) {
            DialogC1390150mHN dialogC1390150mHN2 = new DialogC1390150mHN(context);
            dialogC1390150mHN2.LJJLJLI(C20642515q3.LJI(2131832391));
            dialogC1390150mHN2.LJJLL(f, false);
            dialogC1390150mHN2.LJJLJ(false);
            dialogC1390150mHN2.LJJLIIJ(true);
            dialogC1390150mHN2.setCanceledOnTouchOutside(false);
            dialogC1390150mHN2.LLILZLL = new InterfaceC1389630mGX() { // from class: X.18WT
                @Override // X.InterfaceC1389630mGX
                public final void LIZ(DialogC19728412Gs dialogC19728412Gs) {
                    C09AE c09ae2 = c09ae;
                    if (c09ae2 != null) {
                        c09ae2.LIZIZ(null);
                    }
                }
            };
            C786410Ut5.K4(dialogC1390150mHN2);
            this.LLJ = dialogC1390150mHN2;
            return;
        }
        dialogC1390150mHN.LJJLL(f, false);
        DialogC1390150mHN dialogC1390150mHN3 = this.LLJ;
        if (dialogC1390150mHN3 == null) {
            return;
        }
        C786410Ut5.K4(dialogC1390150mHN3);
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> oo(String str, String str2, int i) {
        return H2().oo(str, str2, i);
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> KX(Context context, String str, String str2, AIChatGenNode aIChatGenNode) {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C1157780gEa.LIZ);
        InterfaceC497601wk interfaceC497601wk = this.LLILLJJLI;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C18WM(this, str2, aIChatGenNode, str, c2252321DDqLIZ, context, null), 2).LJII(new AwS111S1200000_28(str, this, c2252321DDqLIZ, 11));
        return c2252321DDqLIZ;
    }

    @Override // X.C18VN
    public C05YD<InterfaceC1157570gEF<String>> Fg0(Context context, String str, String str2, String str3, AIChatGenNode aIChatGenNode) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        C18UP c18up = C18UP.LIZ;
        C18UJ c18ujG2 = G2();
        c18up.getClass();
        C18UP.LJII(c18ujG2, "download", str3, aIChatGenNode);
        C18T2.LIZ.getClass();
        C18T2.LIZIZ("ai_chat_image_save_local_duration", str);
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) co(str);
        if (!(interfaceC332260D0u.getValue() instanceof C1157580gEG)) {
            C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C18WL(interfaceC332260D0u, context, this, str3, jCurrentTimeMillis, aIChatGenNode, str, null), new C095D(new C1890230zHx(oo(str, str2, 3), null, context))));
        }
        return interfaceC332260D0u;
    }
}
