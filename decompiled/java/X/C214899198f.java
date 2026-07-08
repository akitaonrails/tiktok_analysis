package X;

import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.group.GroupRecord;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS159S0400000_32;

/* JADX INFO: renamed from: X.198f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214899198f {
    public static List LIZ(Bundle bundle) {
        Bundle bundle2;
        if (bundle == null) {
            return C13BV.INSTANCE;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("bd-scene-nav:group_stack");
        if (parcelableArrayList != null && parcelableArrayList.size() != 0) {
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("bd-scene-nav:group_scene_manager");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList(parcelableArrayList);
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                GroupRecord groupRecord = (GroupRecord) ListProtector.get(arrayList2, i);
                Bundle bundle3 = null;
                if (parcelableArrayList2 != null) {
                    bundle2 = (Bundle) ListProtector.get(parcelableArrayList2, i);
                } else {
                    bundle2 = null;
                }
                String str = groupRecord.LLILZIL;
                if (bundle2 != null) {
                    bundle3 = bundle2.getBundle("bd-scene-nav:scene_argument");
                }
                arrayList.add(new C790260UzI(str, bundle3, bundle2, new AwS159S0400000_32(parcelableArrayList, (ArrayList<GroupRecord>) groupRecord, (GroupRecord) parcelableArrayList2, (ArrayList<Bundle>) bundle2, (Bundle) 2)));
            }
            return C13LP.LLIIII(arrayList);
        }
        return C13BV.INSTANCE;
    }
}
