package X;

import android.content.Context;
import android.graphics.RectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11j4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19580011j4 extends AbstractC19580211j6 {
    public final Aweme LJ;
    public NormalTrackTimeStamp LJFF;
    public RectF LJI;

    @Override // X.AbstractC19580211j6
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct interactStickerStruct) {
        return C19580611jA.LIZJ(j, interactStickerStruct);
    }

    @Override // X.AbstractC19580211j6
    public final void LJIIJJI(float f, float f2, InterfaceC19579211iw interfaceC19579211iw) {
        C19579911j3 c19579911j3;
        AbstractC19586911kB abstractC19586911kB = this.LIZIZ;
        if ((abstractC19586911kB instanceof C19579911j3) && (c19579911j3 = (C19579911j3) abstractC19586911kB) != null) {
            if (C304900BxI.LIZ()) {
                QaStruct qaStruct = this.LIZJ.getQaStruct();
                if (qaStruct != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C19580111j5(qaStruct, this, f, f2, c19579911j3, null), 3);
                    return;
                }
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c19579911j3.LIZIZ);
            c1389890mGx.LJIIIZ(2131845725);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.AbstractC19580211j6, X.InterfaceC19594911lT
    public final boolean LJI(float f, float f2, int i, long j) {
        List<NormalTrackTimeStamp> listLIZJ = C19580611jA.LIZJ(j, this.LIZJ);
        if (listLIZJ == null) {
            return false;
        }
        ArrayList<RectF> arrayList = new ArrayList();
        for (NormalTrackTimeStamp normalTrackTimeStamp : listLIZJ) {
            if (normalTrackTimeStamp != null) {
                arrayList.add(LIZ(normalTrackTimeStamp));
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        int i2 = 0;
        for (RectF rectF : arrayList) {
            int i3 = i2 + 1;
            if (ListProtector.get(listLIZJ, i2) != null) {
                Object obj = ListProtector.get(listLIZJ, i2);
                if (obj != null) {
                    if (C0GZ4.LIZ(f, f2, rectF, ((NormalTrackTimeStamp) obj).getRotation())) {
                        Object obj2 = ListProtector.get(listLIZJ, i2);
                        if (obj2 != null) {
                            this.LJFF = (NormalTrackTimeStamp) obj2;
                            this.LJI = rectF;
                            return true;
                        }
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            i2 = i3;
        }
        return false;
    }

    public C19580011j4(Context context, C19579911j3 c19579911j3, InteractStickerStruct interactStickerStruct, C705930RmZ c705930RmZ, Aweme aweme) {
        super(context, c19579911j3, interactStickerStruct, c705930RmZ);
        this.LJ = aweme;
    }
}
