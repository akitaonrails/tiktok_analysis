package X;

import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0n0K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418020n0K {
    public static final /* synthetic */ int LIZ = 0;

    public static Meta LIZ(MetaExt metaExt) {
        Meta meta = new Meta();
        SmartMovieJniJNI.Meta_setHeight(meta.LIZ, meta, metaExt.height);
        List<String> list = metaExt.includes;
        VecStr vecStr = new VecStr();
        Iterator<String> it2 = list.iterator();
        while (it2.hasNext()) {
            vecStr.LIZJ(it2.next());
        }
        SmartMovieJniJNI.Meta_setIncludes(meta.LIZ, meta, VecStr.LJ(vecStr), vecStr);
        SmartMovieJniJNI.Meta_setName(meta.LIZ, meta, metaExt.name);
        SmartMovieJniJNI.Meta_setPath(meta.LIZ, meta, metaExt.path);
        SmartMovieJniJNI.Meta_setFileUriPath(meta.LIZ, meta, metaExt.fileUriPath);
        SmartMovieJniJNI.Meta_setRotation(meta.LIZ, meta, metaExt.rotation);
        SmartMovieJniJNI.Meta_setFrameTimeStamp(meta.LIZ, meta, metaExt.frameTimeStamp);
        SmartMovieJniJNI.Meta_setCreateTime(meta.LIZ, meta, metaExt.createTime);
        SmartMovieJniJNI.Meta_setWidth(meta.LIZ, meta, metaExt.width);
        SmartMovieJniJNI.Meta_setIsVideo(meta.LIZ, meta, metaExt.isVideo());
        SmartMovieJniJNI.Meta_setDuration(meta.LIZ, meta, metaExt.duration);
        SmartMovieJniJNI.Meta_setHasAudio(meta.LIZ, meta, metaExt.hasAudio);
        return meta;
    }

    public static MetaExt LIZIZ(Meta meta) {
        MetaExt metaExt = new MetaExt(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null);
        metaExt.setHeight((int) meta.LIZJ());
        VecStr vecStr = new VecStr(SmartMovieJniJNI.Meta_getIncludes(meta.LIZ, meta));
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = vecStr.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        metaExt.setIncludes(arrayList);
        metaExt.setName(SmartMovieJniJNI.Meta_getName(meta.LIZ, meta));
        metaExt.setPath(meta.LIZLLL());
        metaExt.setFileUriPath(SmartMovieJniJNI.Meta_getFileUriPath(meta.LIZ, meta));
        metaExt.setRotation((int) SmartMovieJniJNI.Meta_getRotation(meta.LIZ, meta));
        metaExt.setFrameTimeStamp(SmartMovieJniJNI.Meta_getFrameTimeStamp(meta.LIZ, meta));
        metaExt.setCreateTime(SmartMovieJniJNI.Meta_getCreateTime(meta.LIZ, meta));
        metaExt.setWidth((int) meta.LJ());
        metaExt.setVideo(meta.LJFF());
        metaExt.setDuration(meta.LIZIZ());
        metaExt.setHasAudio(SmartMovieJniJNI.Meta_getHasAudio(meta.LIZ, meta));
        return metaExt;
    }

    public static List LIZJ(VecMeta vecMeta) {
        ArrayList arrayList = new ArrayList();
        Iterator<Meta> it2 = vecMeta.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZIZ(it2.next()));
        }
        return arrayList;
    }

    public static VecMeta LIZLLL(List list) {
        VecMeta vecMeta = new VecMeta();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            vecMeta.LIZJ(LIZ((MetaExt) it2.next()));
            arrayList.add(Boolean.TRUE);
        }
        return vecMeta;
    }
}
