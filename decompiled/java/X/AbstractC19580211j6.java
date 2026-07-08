package X;

import android.content.Context;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.11j6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19580211j6 implements InterfaceC19594911lT {
    public final Context LIZ;
    public final AbstractC19586911kB LIZIZ;
    public final InteractStickerStruct LIZJ;
    public C705930RmZ LIZLLL;

    public abstract List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct);

    public abstract void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw);

    public RectF LIZ(NormalTrackTimeStamp normalTrackTimeStamp) {
        float f;
        C705930RmZ c705930RmZ = this.LIZLLL;
        float f2 = 0.0f;
        if (c705930RmZ == null) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float f3 = c705930RmZ.LIZ;
        float f4 = c705930RmZ.LIZIZ;
        if (f3 == f4) {
            return new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        float width = f3 * normalTrackTimeStamp.getWidth();
        float height = f4 * normalTrackTimeStamp.getHeight();
        C705930RmZ c705930RmZ2 = this.LIZLLL;
        if (c705930RmZ2 != null) {
            f = c705930RmZ2.LIZ;
        } else {
            f = 0.0f;
        }
        float f5 = 2;
        float x = (f * normalTrackTimeStamp.getX()) - (width / f5);
        C705930RmZ c705930RmZ3 = this.LIZLLL;
        if (c705930RmZ3 != null) {
            f2 = c705930RmZ3.LIZIZ;
        }
        float y = (f2 * normalTrackTimeStamp.getY()) - (height / f5);
        return new RectF(x, y, width + x, height + y);
    }

    public AbstractC19580211j6(Context context, AbstractC19586911kB abstractC19586911kB, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ) {
        this.LIZ = context;
        this.LIZIZ = abstractC19586911kB;
        this.LIZJ = interactStickerStruct;
        this.LIZLLL = c705930RmZ;
    }

    @Override // X.InterfaceC19594911lT
    public boolean LJI(float f, float f2, int i, long j) {
        List<NormalTrackTimeStamp> listLIZIZ = LIZIZ(j, this.LIZJ);
        if (listLIZIZ == null) {
            return false;
        }
        ArrayList<RectF> arrayList = new ArrayList();
        Iterator<NormalTrackTimeStamp> it2 = listLIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(LIZ(it2.next()));
        }
        int i2 = 0;
        for (RectF rectF : arrayList) {
            int i3 = i2 + 1;
            if (ListProtector.get(listLIZIZ, i2) != null && C0GZ4.LIZ(f, f2, rectF, ((NormalTrackTimeStamp) ListProtector.get(listLIZIZ, i2)).getRotation())) {
                return true;
            }
            i2 = i3;
        }
        return false;
    }

    @Override // X.InterfaceC19594911lT
    public boolean LJIIIZ(long j, int i, float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        if (LJI(f, f2, i, j)) {
            LJIIJJI(f, f2, interfaceC19579211iw);
            return true;
        }
        return false;
    }
}
