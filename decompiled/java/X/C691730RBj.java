package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0RBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C691730RBj {
    public static final <ASSEM extends ReusedUIAssem<? extends C03H5>> void LIZ(ASSEM assem, C0RBZ c0rbz, VideoItemParams videoItemParams) {
        if (C729510SjV.LJJIIZ(videoItemParams.getAweme())) {
            return;
        }
        Iterator it2 = ((List) c0rbz.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            InterfaceC445610Hdf interfaceC445610Hdf = (InterfaceC445610Hdf) it2.next();
            if (assem instanceof InterfaceC691660RBc) {
                if (interfaceC445610Hdf.Fc(videoItemParams, ((InterfaceC691660RBc) assem).jm())) {
                    C723830SaL.LJ(assem, interfaceC445610Hdf.getType(), true, null);
                    it2.remove();
                }
            } else {
                "Failed requirement.".toString();
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
    }
}
