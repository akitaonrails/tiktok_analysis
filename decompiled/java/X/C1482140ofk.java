package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.playereventreporter.VideoInfo;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0ofk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482140ofk {
    public final ArrayList<C1482150ofl> LIZ = new ArrayList<>();
    public C1482150ofl LIZIZ;

    public final synchronized C1482150ofl LIZ(String str) {
        String str2;
        if (!TextUtils.isEmpty(str)) {
            C1482150ofl c1482150ofl = this.LIZIZ;
            if (c1482150ofl != null) {
                str2 = c1482150ofl.LIZIZ;
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str, str2)) {
                if (this.LIZ.size() > 0) {
                    for (int size = this.LIZ.size() - 1; -1 < size; size--) {
                        C1482150ofl c1482150ofl2 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                        if (TextUtils.equals(c1482150ofl2.LIZIZ, str)) {
                            return c1482150ofl2;
                        }
                    }
                }
                return null;
            }
        }
        return this.LIZIZ;
    }

    public final synchronized C1481690of1 LIZIZ(String str) {
        C1481600oes c1481600oes;
        String str2;
        C1481690of1 c1481690of1 = null;
        if (!TextUtils.isEmpty(str)) {
            C1482150ofl c1482150ofl = this.LIZIZ;
            if (c1482150ofl != null) {
                str2 = c1482150ofl.LIZIZ;
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str, str2)) {
                if (this.LIZ.size() > 0) {
                    for (int size = this.LIZ.size() - 1; -1 < size; size--) {
                        C1482150ofl c1482150ofl2 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                        if (TextUtils.equals(c1482150ofl2.LIZIZ, str)) {
                            return c1482150ofl2.LIZJ.LIZJ;
                        }
                    }
                }
                return null;
            }
        }
        C1482150ofl c1482150ofl3 = this.LIZIZ;
        if (c1482150ofl3 != null && (c1481600oes = c1482150ofl3.LIZJ) != null) {
            c1481690of1 = c1481600oes.LIZJ;
        }
        return c1481690of1;
    }

    public final synchronized VideoInfo LIZJ(String str) {
        C1481600oes c1481600oes;
        String str2;
        if (C625790Ogb.LIZ()) {
            String strLIZIZ = "";
            for (C1482150ofl c1482150ofl : this.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(c1482150ofl.LIZIZ);
                sbLIZ.append(',');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pm getCurrentVideoInfo sessionList size ");
            sbLIZ2.append(this.LIZ.size());
            sbLIZ2.append(" ,session list : ");
            sbLIZ2.append(strLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        VideoInfo videoInfo = null;
        if (!TextUtils.isEmpty(str)) {
            C1482150ofl c1482150ofl2 = this.LIZIZ;
            if (c1482150ofl2 != null) {
                str2 = c1482150ofl2.LIZIZ;
            } else {
                str2 = null;
            }
            if (!TextUtils.equals(str, str2)) {
                if (this.LIZ.size() > 0) {
                    for (int size = this.LIZ.size() - 1; -1 < size; size--) {
                        C1482150ofl c1482150ofl3 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                        if (TextUtils.equals(c1482150ofl3.LIZIZ, str)) {
                            return c1482150ofl3.LIZJ.LIZIZ;
                        }
                    }
                }
                return null;
            }
        }
        C1482150ofl c1482150ofl4 = this.LIZIZ;
        if (c1482150ofl4 != null && (c1481600oes = c1482150ofl4.LIZJ) != null) {
            videoInfo = c1481600oes.LIZIZ;
        }
        return videoInfo;
    }

    public final synchronized void LJFF(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1482150ofl c1482150ofl = this.LIZIZ;
        if (c1482150ofl == null) {
            return;
        }
        if (TextUtils.equals(str, c1482150ofl.LIZIZ)) {
            this.LIZIZ.LIZJ.getClass();
        } else if (this.LIZ.size() > 0) {
            int size = this.LIZ.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                C1482150ofl c1482150ofl2 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                if (TextUtils.equals(c1482150ofl2.LIZIZ, str)) {
                    c1482150ofl2.LIZJ.getClass();
                    break;
                }
                size--;
            }
        }
    }

    public final synchronized void LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1482150ofl c1482150ofl = this.LIZIZ;
        if (c1482150ofl == null) {
            return;
        }
        if (TextUtils.equals(str, c1482150ofl.LIZIZ)) {
            this.LIZIZ.LIZJ.getClass();
        } else if (this.LIZ.size() > 0) {
            int size = this.LIZ.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                C1482150ofl c1482150ofl2 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                if (TextUtils.equals(c1482150ofl2.LIZIZ, str)) {
                    c1482150ofl2.LIZJ.getClass();
                    break;
                }
                size--;
            }
        }
    }

    public final synchronized void LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1482150ofl c1482150ofl = this.LIZIZ;
        if (c1482150ofl == null) {
            return;
        }
        if (TextUtils.equals(str, c1482150ofl.LIZIZ)) {
            this.LIZIZ = null;
        } else if (this.LIZ.size() > 0) {
            int size = this.LIZ.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                C1482150ofl c1482150ofl2 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                if (TextUtils.equals(c1482150ofl2.LIZIZ, str)) {
                    c1482150ofl2.LIZJ.getClass();
                    break;
                }
                size--;
            }
        }
    }

    public final synchronized void LIZLLL(String str, C1481560oeo c1481560oeo) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1482150ofl c1482150ofl = this.LIZIZ;
        if (c1482150ofl == null) {
            C1481600oes c1481600oes = new C1481600oes();
            this.LIZIZ = new C1482150ofl(c1481560oeo.LJJIJIIJI, str, c1481600oes);
            c1481600oes.LIZ(c1481560oeo);
        } else if (TextUtils.equals(str, c1482150ofl.LIZIZ)) {
            this.LIZIZ.LIZJ.LIZ(c1481560oeo);
        } else if (this.LIZ.size() > 0) {
            int size = this.LIZ.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                C1482150ofl c1482150ofl2 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                if (TextUtils.equals(c1482150ofl2.LIZIZ, str)) {
                    c1482150ofl2.LIZJ.LIZ(c1481560oeo);
                    break;
                }
                size--;
            }
        }
    }

    public final synchronized void LJ(String str, C1481690of1 c1481690of1) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1482150ofl c1482150ofl = this.LIZIZ;
        if (c1482150ofl == null) {
            return;
        }
        if (TextUtils.equals(str, c1482150ofl.LIZIZ)) {
            C1481600oes c1481600oes = this.LIZIZ.LIZJ;
            c1481600oes.getClass();
            c1481600oes.LIZJ = c1481690of1;
        } else if (this.LIZ.size() > 0) {
            int size = this.LIZ.size() - 1;
            while (true) {
                if (-1 >= size) {
                    break;
                }
                C1482150ofl c1482150ofl2 = (C1482150ofl) ListProtector.get(this.LIZ, size);
                if (TextUtils.equals(c1482150ofl2.LIZIZ, str)) {
                    C1481600oes c1481600oes2 = c1482150ofl2.LIZJ;
                    c1481600oes2.getClass();
                    c1481600oes2.LIZJ = c1481690of1;
                    break;
                }
                size--;
            }
        }
    }

    public final synchronized void LJIIIIZZ(String str, C1481580oeq c1481580oeq) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C1482150ofl c1482150ofl = this.LIZIZ;
        if (c1482150ofl != null) {
            if (!TextUtils.equals(str, c1482150ofl.LIZIZ)) {
                if (this.LIZ.size() > 10) {
                    ListProtector.remove(this.LIZ, 0);
                }
                this.LIZ.add(this.LIZIZ);
                C1481600oes c1481600oes = new C1481600oes();
                this.LIZIZ = new C1482150ofl(c1481580oeq.LJFF, str, c1481600oes);
                c1481600oes.LIZIZ(str, c1481580oeq);
            } else {
                this.LIZIZ.LIZJ.LIZJ(str, c1481580oeq);
            }
        } else {
            C1481600oes c1481600oes2 = new C1481600oes();
            this.LIZIZ = new C1482150ofl(c1481580oeq.LJFF, str, c1481600oes2);
            c1481600oes2.LIZIZ(str, c1481580oeq);
        }
    }
}
