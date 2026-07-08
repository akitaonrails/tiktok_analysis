package X;

import com.bytedance.keva.Keva;
import com.bytedance.touchpoint.api.model.CommonVideo;
import com.bytedance.touchpoint.api.model.CommonVideoContent;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TaskEventContent;
import com.bytedance.touchpoint.api.model.UserActionContent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0zW8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899020zW8 extends AbstractC1899090zWF {
    public int LLIZ;
    public final Map<String, CommonVideo> LLIZLLLIL;

    @Override // X.InterfaceC1899310zWb
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJ() {
        this.LLIZ = 0;
        ((LinkedHashMap) this.LLIZLLLIL).clear();
        Keva keva = C1898830zVp.LIZ;
        C1898830zVp.LIZIZ(this.LL);
    }

    @Override // X.AbstractC1899090zWF
    public final void LJI() {
        this.LLIZ = 0;
        ((LinkedHashMap) this.LLIZLLLIL).clear();
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZIZ() {
        CommonVideoContent commonVideoContent;
        List<CommonVideo> list;
        Keva keva = C1898830zVp.LIZ;
        TaskEventContent taskEventContentLIZJ = C1898830zVp.LIZJ(this.LL);
        if (taskEventContentLIZJ == null || (commonVideoContent = taskEventContentLIZJ.userActionContent.repostVideoContent) == null || (list = commonVideoContent.videos) == null || list.isEmpty()) {
            return;
        }
        for (CommonVideo commonVideo : list) {
            this.LLIZ++;
            this.LLIZLLLIL.put(commonVideo.itemId, commonVideo);
        }
    }

    public final TaskEventContent LJIILL() {
        if (!(!this.LLIZLLLIL.isEmpty())) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((LinkedHashMap) this.LLIZLLLIL).values());
        return C1898850zVr.LIZ(this.LL, "repost", new UserActionContent(null, null, null, null, new CommonVideoContent(arrayList), null, null, null, null), null);
    }

    @Override // X.InterfaceC1899310zWb
    public final void LIZ() {
        TaskEventContent taskEventContentLJIILL = LJIILL();
        if (taskEventContentLJIILL != null) {
            Keva keva = C1898830zVp.LIZ;
            C1898830zVp.LIZLLL(this.LL, taskEventContentLJIILL);
        }
    }

    public C1899020zW8(TaskEvent taskEvent) {
        super(taskEvent);
        this.LLIZLLLIL = new LinkedHashMap();
    }

    @Override // X.InterfaceC1899310zWb
    public final void LJFF(TaskEventContent taskEventContent, C1898920zVy c1898920zVy) {
        List<CommonVideo> list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        CommonVideoContent commonVideoContent = taskEventContent.userActionContent.repostVideoContent;
        if (commonVideoContent != null && (list = commonVideoContent.videos) != null) {
            for (CommonVideo commonVideo : list) {
                String str = commonVideo.pageType;
                String str2 = (String) linkedHashMap.get(str);
                if (str2 != null && str2.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append(',');
                    sbLIZ.append(commonVideo.itemId);
                    linkedHashMap.put(str, C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    linkedHashMap.put(str, commonVideo.itemId);
                }
            }
        }
        C1894320zOY c1894320zOY = C1894320zOY.LIZ;
        TaskEvent taskEvent = this.LL;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("group_ids", C20484080s.LIZJ(linkedHashMap));
        c1894320zOY.getClass();
        C1894320zOY.LJIIIZ(taskEvent, linkedHashMap2);
    }
}
