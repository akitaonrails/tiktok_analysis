package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS154S0101000_14;

/* JADX INFO: renamed from: X.0XjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC856750XjF {
    public final VideoPublishEditModel LIZ;
    public final ArrayList<AbstractC856710XjB> LIZIZ;
    public final InterfaceC1455860nzM LIZJ;

    public void LIZ() {
    }

    public abstract int LIZIZ();

    public AbstractC856710XjB LIZJ() {
        return null;
    }

    public boolean LJII() {
        return this instanceof C856720XjC;
    }

    public final ArrayList<Integer> LIZLLL() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Iterator<AbstractC856710XjB> it2 = LJ().iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(it2.next().LIZ()));
        }
        return arrayList;
    }

    public ArrayList<AbstractC856710XjB> LJ() {
        return this.LIZIZ;
    }

    public InterfaceC1455860nzM LJFF() {
        return this.LIZJ;
    }

    public VideoPublishEditModel LJI() {
        return this.LIZ;
    }

    public AbstractC856750XjF(VideoPublishEditModel videoPublishEditModel, ArrayList arrayList, InterfaceC1446740nke interfaceC1446740nke) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = arrayList;
        this.LIZJ = interfaceC1446740nke;
    }

    public void LJIIIIZZ(FragmentManager fragmentManager, Context context, VideoPublishEditModel videoPublishEditModel, int i, AwS154S0101000_14 awS154S0101000_14, AwS154S0101000_14 awS154S0101000_142) {
        AbstractC856710XjB abstractC856710XjBLIZJ = LIZJ();
        if (abstractC856710XjBLIZJ != null) {
            abstractC856710XjBLIZJ.LJ(fragmentManager, context, videoPublishEditModel, i, awS154S0101000_14, awS154S0101000_142);
        }
    }
}
