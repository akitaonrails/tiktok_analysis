package X;

import com.bytedance.services.slardar.config.IConfigManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791170V1v implements InterfaceC792030V5d {
    public final Map<String, Boolean> LL = new ConcurrentHashMap();
    public final Map<String, Boolean> LLILLJJLI = new ConcurrentHashMap();
    public final List<String> LLILLL;
    public final List<String> LLILZ;
    public final List<String> LLILZIL;
    public final List<String> LLILZLL;
    public final Map<String, String> LLIZ;
    public volatile JSONObject LLIZLLLIL;

    @Override // X.InterfaceC792030V5d
    public final void LIZ() {
    }

    public C791170V1v() {
        HashMap map = new HashMap();
        this.LLIZ = map;
        LinkedList linkedList = new LinkedList();
        this.LLILLL = linkedList;
        linkedList.addAll(Arrays.asList("battery", "smooth", "cpu", "disk", "memory", "thread", "fd", "page_load", "page_load_trace", "start", "start_trace", "traffic", "ui"));
        ArrayList arrayList = new ArrayList();
        this.LLILZ = arrayList;
        arrayList.add("enable_upload");
        arrayList.add("drop_enable_upload");
        arrayList.add("serious_block_enable_upload");
        arrayList.add("block_enable_upload");
        arrayList.add("slow_method_enable_upload");
        LinkedList linkedList2 = new LinkedList();
        this.LLILZIL = linkedList2;
        linkedList2.add("enable_perf_data_collect");
        LinkedList linkedList3 = new LinkedList();
        this.LLILZLL = linkedList3;
        linkedList3.add("enable_exception_upload");
        map.put("enable_upload", "fps");
        map.put("drop_enable_upload", "fps_drop");
        map.put("block_enable_upload", "block_monitor");
        map.put("slow_method_enable_upload", "drop_frame_stack");
        map.put("serious_block_enable_upload", "serious_block_monitor");
        ((IConfigManager) C792600V7i.LIZ(IConfigManager.class)).registerConfigListener(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0156 A[SYNTHETIC] */
    @Override // X.InterfaceC792030V5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(org.json.JSONObject r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C791170V1v.LJFF(org.json.JSONObject, boolean):void");
    }
}
