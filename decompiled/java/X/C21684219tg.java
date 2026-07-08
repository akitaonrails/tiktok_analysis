package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: renamed from: X.19tg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21684219tg {
    public final Method LIZ;
    public boolean LIZIZ;
    public boolean LIZJ = true;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;
    public List<RecyclerView.ViewHolder> LJIIJJI;

    public C21684219tg() {
        try {
            Method declaredMethod = RecyclerView.ViewHolder.class.getDeclaredMethod("isRemoved", new Class[0]);
            this.LIZ = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LayoutState{vhIsRemoved=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mOnRefresLayout=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mRecycle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mOffset=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mAvailable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mCurrentPosition=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mItemDirection=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", mLayoutDirection=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", mScrollingOffset=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", mExtra=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", mFixOffset=");
        sbLIZ.append(0);
        sbLIZ.append(", mIsPreLayout=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", mScrapList=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
