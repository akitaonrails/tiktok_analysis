package Y;

import X.C08XD;
import X.C0CHQ;
import X.C10AX;
import X.C1155990gBh;
import X.C1157450gE3;
import X.C1157580gEG;
import X.C1157780gEa;
import X.C12G3;
import X.C13BV;
import X.C13LP;
import X.C13LZ;
import X.C1428520nHG;
import X.C1433920nPy;
import X.C1436990nUv;
import X.C15438062q;
import X.C18T2;
import X.C18VZ;
import X.C19210610Do;
import X.C19210910Dr;
import X.C1954807lC;
import X.C21163117rp;
import X.C21287718Sl;
import X.C21288018So;
import X.C21290818Tq;
import X.C214848196g;
import X.C2188811AlT;
import X.C298640BnC;
import X.C427580Gpg;
import X.C512401z8;
import X.EnumC21295518Vl;
import X.InterfaceC1157570gEF;
import X.InterfaceC1364105Vn;
import X.InterfaceC332260D0u;
import X.InterfaceC346701Wf;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.edit.aicover.AICoverInfo;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS433S0200000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes33.dex */
public class AgS310S0100000_32 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS310S0100000_32(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object emit$0(AgS310S0100000_32 agS310S0100000_32, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String promptId;
        InterfaceC1157570gEF interfaceC1157570gEF = (InterfaceC1157570gEF) obj;
        if (!Intrinsics.LJFF(interfaceC1157570gEF, C1157780gEa.LIZ)) {
            if (interfaceC1157570gEF instanceof C1155990gBh) {
                ((C21287718Sl) agS310S0100000_32.l0).LLJJI.setValue(C13BV.INSTANCE);
                C18T2.LIZ.getClass();
                C18T2.LJI("ai_chat_action_bar_success", false);
            } else if (interfaceC1157570gEF instanceof C1157580gEG) {
                ((C21287718Sl) agS310S0100000_32.l0).LLJJI.setValue(C13BV.INSTANCE);
            } else if (interfaceC1157570gEF instanceof C1157450gE3) {
                C21287718Sl c21287718Sl = (C21287718Sl) agS310S0100000_32.l0;
                InterfaceC332260D0u<List<C427580Gpg>> interfaceC332260D0u = c21287718Sl.LLJJI;
                Iterable<C21288018So> iterable = (Iterable) ((C1157450gE3) interfaceC1157570gEF).LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
                for (C21288018So c21288018So : iterable) {
                    List<String> list = c21287718Sl.LLJJIJIIJIL;
                    list.add(c21288018So.LIZIZ);
                    if (list.size() > 1) {
                        C08XD.LJJ(list, new C512401z8(17));
                    }
                    String str = c21288018So.LIZ;
                    String str2 = c21288018So.LIZIZ;
                    String str3 = c21288018So.LIZJ;
                    List<String> list2 = c21288018So.LIZLLL;
                    String str4 = c21288018So.LJ;
                    String str5 = c21288018So.LJFF;
                    AIChatGenPrompt value = c21287718Sl.LLJJIJI.getValue();
                    if (value != null) {
                        promptId = value.getPromptId();
                    } else {
                        promptId = null;
                    }
                    arrayList.add(new C427580Gpg(str, str2, str3, list2, str4, str5, Intrinsics.LJFF(str, promptId), new AwS433S0200000_32(c21287718Sl, c21288018So, 31), new AwS433S0200000_32(c21287718Sl, c21288018So, 32)));
                }
                interfaceC332260D0u.setValue(arrayList);
                C18T2.LIZ.getClass();
                C18T2.LIZLLL("ai_chat_action_bar_ready_duration");
                C18T2.LJI("ai_chat_action_bar_success", true);
            } else {
                throw new C1954807lC();
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS310S0100000_32 agS310S0100000_32, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AIChatGenPrompt aIChatGenPrompt = (AIChatGenPrompt) obj;
        ((C18VZ) agS310S0100000_32.l0).o8();
        if (aIChatGenPrompt != null && aIChatGenPrompt.getPromptId() != null) {
            String str = ((C18VZ) agS310S0100000_32.l0).LLJLILLLLZIIL;
            if (str != null) {
                aIChatGenPrompt.setPromptText(str);
                ((C18VZ) agS310S0100000_32.l0).LLJLILLLLZIIL = null;
            }
            C18VZ c18vz = (C18VZ) agS310S0100000_32.l0;
            c18vz.LLJLLL.LIZJ = aIChatGenPrompt;
            c18vz.F4(aIChatGenPrompt.getPromptText(), null, EnumC21295518Vl.REPLACE);
        } else {
            C18VZ c18vz2 = (C18VZ) agS310S0100000_32.l0;
            c18vz2.LLJLLL.LIZJ = null;
            c18vz2.h8();
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS310S0100000_32 agS310S0100000_32, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zLIZJ = C21163117rp.LIZIZ().LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generation State: ");
        sbLIZ.append(zLIZJ);
        C21290818Tq.LIZ("AiChatInputFeatureComponent", C2188811AlT.LIZIZ(sbLIZ));
        C18VZ c18vz = (C18VZ) agS310S0100000_32.l0;
        if (c18vz.LLJL != zLIZJ) {
            c18vz.LLJL = zLIZJ;
            c18vz.k5();
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS310S0100000_32 agS310S0100000_32, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int iLJ;
        SubOnlyPhotoPreviewInfo subOnlyPhotoPreviewInfo;
        ArrayList<String> arrayList;
        String path;
        SingleImageData singleImageData = (SingleImageData) obj;
        C214848196g c214848196g = (C214848196g) agS310S0100000_32.l0;
        ImageAlbumData imageAlbumData = c214848196g.LIZ.getImageAlbumData();
        if (imageAlbumData != null) {
            C0CHQ.LIZ().getPublishService().LJJJIL();
            C1433920nPy.LIZ("insert_ai_cover_image");
            Iterator<SingleImageData> it2 = imageAlbumData.getImageList().iterator();
            boolean z = false;
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().isAICover()) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            AICoverInfo aiCoverInfo = imageAlbumData.getAiCoverInfo();
            if (aiCoverInfo != null) {
                iLJ = C13LZ.LJ(aiCoverInfo.getInsertIndex(), 0, imageAlbumData.getImageList().size());
            } else {
                iLJ = 0;
            }
            if (i >= 0) {
                iLJ = i;
            }
            SingleImageData singleImageData2 = (SingleImageData) C13LP.LJJJLZIJ(i, imageAlbumData.getImageList());
            if (singleImageData2 != null) {
                subOnlyPhotoPreviewInfo = singleImageData2.getSubOnlyPhotoPreviewInfo();
            } else {
                subOnlyPhotoPreviewInfo = null;
            }
            if (iLJ == 0 && C298640BnC.LIZ() && C19210610Do.LIZ(c214848196g.LIZ)) {
                z = true;
                subOnlyPhotoPreviewInfo = new SubOnlyPhotoPreviewInfo(true);
            } else if (i < 0) {
                subOnlyPhotoPreviewInfo = singleImageData.getSubOnlyPhotoPreviewInfo();
            }
            singleImageData.setSubOnlyPhotoPreviewInfo(subOnlyPhotoPreviewInfo);
            ArrayList arrayList2 = new ArrayList(imageAlbumData.getImageList());
            if (i >= 0) {
                ListProtector.set(arrayList2, i, singleImageData);
            } else {
                ListProtector.add(arrayList2, iLJ, singleImageData);
            }
            imageAlbumData.setImageList(arrayList2);
            if (z) {
                C19210910Dr.LIZ(C10AX.LIZ);
            }
            MvCreateVideoData mvCreateVideoData = c214848196g.LIZ.getMvCreateVideoData();
            if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
                ImportVideoInfo originAlbumImageData = singleImageData.getOriginAlbumImageData();
                if (originAlbumImageData == null || (path = originAlbumImageData.getOriginImportPath()) == null) {
                    path = singleImageData.getSrcImageInfo().getPath();
                }
                if (i >= 0) {
                    if (i < arrayList.size()) {
                        ListProtector.set(arrayList, i, path);
                    }
                } else if (iLJ <= arrayList.size()) {
                    ListProtector.add(arrayList, iLJ, path);
                }
            }
            Function0<Unit> function0 = c214848196g.LJII;
            if (function0 != null) {
                function0.invoke();
            }
            C1428520nHG.LJLIIIL(c214848196g.LIZ);
            C1436990nUv.LJIIJJI(c214848196g.LIZ);
            c214848196g.LIZLLL.LIZLLL();
            C12G3 c12g3LIZ = c214848196g.LJJIJIIJIL;
            if (c12g3LIZ != null || (c12g3LIZ = c214848196g.LIZ()) != null) {
                c12g3LIZ.LJIILJJIL(c214848196g.LIZ);
            }
            c214848196g.LJIJI();
        }
        return Unit.LIZ;
    }
}
