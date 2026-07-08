package X;

import android.os.Process;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.tools.service.AIImagineCacheCleanTask;
import com.ss.android.ugc.tools.service.AiChatFeatureServiceImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1EP9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EP9 extends C09AY implements Function0<C2236408pW> {
    public final /* synthetic */ AiChatFeatureServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1EP9(AiChatFeatureServiceImpl aiChatFeatureServiceImpl) {
        super(0);
        this.LL = aiChatFeatureServiceImpl;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.08pW] */
    @Override // kotlin.jvm.functions.Function0
    public final C2236408pW invoke() {
        if (this.LL.LIZIZ().isFeatureEnabled()) {
            return new InterfaceC2454409ja() { // from class: X.08pW
                public final int LIZ = Process.myPid();

                public static Keva LJI() {
                    return Keva.getRepo("creation_ai_chat_pinned_cache");
                }

                @Override // X.InterfaceC2454409ja
                public final AIImagineCacheCleanTask LIZLLL() {
                    return new AIImagineCacheCleanTask(this);
                }

                @Override // X.InterfaceC2454409ja
                public final List<File> LIZIZ() {
                    List listLJFF = LJFF(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AI_CHAT, "", true));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (ArrayList) listLJFF) {
                        File file = (File) obj;
                        if (!LJI().getBoolean(file.getPath(), false) && LJI().getInt(LJII(file.getPath()), 0) != this.LIZ) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }

                @Override // X.InterfaceC2454409ja
                public final List<File> getNotCleanableFileList() {
                    List listLJFF = LJFF(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AI_CHAT, "", true));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (ArrayList) listLJFF) {
                        File file = (File) obj;
                        if (LJI().getBoolean(file.getPath(), false) || LJI().getInt(LJII(file.getPath()), 0) == this.LIZ) {
                            arrayList.add(obj);
                        }
                    }
                    return arrayList;
                }

                public static List LJFF(File file) {
                    List listLJJLL;
                    ArrayList arrayList = new ArrayList();
                    if (file.isDirectory()) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles == null || (listLJJLL = C13LQ.LJJLL(fileArrListFiles)) == null) {
                            listLJJLL = C13BV.INSTANCE;
                        }
                        Iterator it2 = listLJJLL.iterator();
                        while (it2.hasNext()) {
                            arrayList.addAll(LJFF((File) it2.next()));
                        }
                    } else {
                        arrayList.add(file);
                    }
                    return arrayList;
                }

                public static String LJII(String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("lifecycle_");
                    sbLIZ.append(str);
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC2454409ja
                public final void LIZ(String str) {
                    LJI().erase(str);
                }

                @Override // X.InterfaceC2454409ja
                public final void LIZJ(String str) {
                    LJI().storeBoolean(str, true);
                }

                @Override // X.InterfaceC2454409ja
                public final void LJ(String str) {
                    LJI().storeInt(LJII(str), this.LIZ);
                }
            };
        }
        return null;
    }
}
