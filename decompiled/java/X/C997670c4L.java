package X;

import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.feed.model.IAdTranslationData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0c4L, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C997670c4L {
    public static final List<InterfaceC996870c33> LIZ = C1697810uHb.LJIIJJI(new InterfaceC996870c33() { // from class: X.0c4M
        @Override // X.InterfaceC996870c33
        public final IAdTranslationData LIZ(IAdTranslatableData iAdTranslatableData, Map<String, String> map) {
            List listUnmodifiableList;
            if (!(iAdTranslatableData instanceof C997740c4S)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (IAdTranslatableData iAdTranslatableData2 : ((C997740c4S) iAdTranslatableData).LIZ) {
                Iterator<InterfaceC996870c33> it2 = C997670c4L.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    IAdTranslationData iAdTranslationDataLIZ = it2.next().LIZ(iAdTranslatableData2, map);
                    if (iAdTranslationDataLIZ != null) {
                        arrayList.add(iAdTranslationDataLIZ);
                        break;
                    }
                }
            }
            if (!(!arrayList.isEmpty()) || (listUnmodifiableList = Collections.unmodifiableList(arrayList)) == null) {
                return null;
            }
            return new C997710c4P(listUnmodifiableList);
        }
    }, new InterfaceC996870c33() { // from class: X.0c31
        @Override // X.InterfaceC996870c33
        public final IAdTranslationData LIZ(IAdTranslatableData iAdTranslatableData, Map<String, String> map) {
            C996820c2y c996820c2y = null;
            if (!(iAdTranslatableData instanceof C996860c32)) {
                return null;
            }
            C996860c32 c996860c32 = (C996860c32) iAdTranslatableData;
            C996840c30 c996840c30 = c996860c32.LIZIZ;
            if (c996840c30 != null) {
                String str = c996840c30.LIZ;
                String str2 = map.get(str);
                if (str2 != null) {
                    str = str2;
                }
                c996820c2y = new C996820c2y(str);
            }
            return new C996810c2x(c996860c32.LIZ, c996820c2y);
        }
    }, new AbstractC1012230cRp() { // from class: X.0cCI
        @Override // X.InterfaceC996870c33
        public final IAdTranslationData LIZ(IAdTranslatableData iAdTranslatableData, Map<String, String> map) {
            Object c1002640cCM;
            if (!(iAdTranslatableData instanceof C1002620cCK)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1002590cCH interfaceC1002590cCH : ((C1002620cCK) iAdTranslatableData).LIZ) {
                if (interfaceC1002590cCH instanceof C1002580cCG) {
                    c1002640cCM = new InterfaceC1002670cCP() { // from class: X.0cCO
                    };
                } else if (interfaceC1002590cCH instanceof C1002610cCJ) {
                    C1002610cCJ c1002610cCJ = (C1002610cCJ) interfaceC1002590cCH;
                    c1002640cCM = new C1002640cCM(c1002610cCJ.LIZIZ, C1002630cCL.LIZ(AbstractC1012230cRp.LIZIZ(c1002610cCJ.LIZJ.LIZ, c1002610cCJ.LJ, map)), c1002610cCJ.LIZLLL, c1002610cCJ.LJ, AbstractC1012230cRp.LIZJ(c1002610cCJ.LJFF, map));
                }
                arrayList.add(c1002640cCM);
            }
            return new C1002680cCQ(arrayList);
        }
    }, new AbstractC1012230cRp() { // from class: X.0c4J
        @Override // X.InterfaceC996870c33
        public final IAdTranslationData LIZ(IAdTranslatableData iAdTranslatableData, Map<String, String> map) {
            Object c997600c4E;
            if (!(iAdTranslatableData instanceof C997620c4G)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (InterfaceC997630c4H interfaceC997630c4H : ((C997620c4G) iAdTranslatableData).LIZ) {
                if (interfaceC997630c4H instanceof C997640c4I) {
                    c997600c4E = new InterfaceC997580c4C(((C997640c4I) interfaceC997630c4H).LIZ) { // from class: X.0c4D
                        public final String LIZ;

                        @Override // X.InterfaceC997580c4C
                        public final String getType() {
                            return this.LIZ;
                        }

                        {
                            this.LIZ = str;
                        }
                    };
                } else if (interfaceC997630c4H instanceof C997660c4K) {
                    C997660c4K c997660c4K = (C997660c4K) interfaceC997630c4H;
                    c997600c4E = new C997600c4E(c997660c4K.LIZ, AbstractC1012230cRp.LIZIZ(c997660c4K.LIZIZ, c997660c4K.LIZLLL, map), c997660c4K.LIZJ, c997660c4K.LIZLLL, AbstractC1012230cRp.LIZJ(c997660c4K.LJ, map));
                }
                arrayList.add(c997600c4E);
            }
            return new C997570c4B(Collections.unmodifiableList(arrayList));
        }
    }, new AbstractC1012230cRp() { // from class: X.0c4N
        @Override // X.InterfaceC996870c33
        public final IAdTranslationData LIZ(IAdTranslatableData iAdTranslatableData, Map<String, String> map) {
            if (!(iAdTranslatableData instanceof C997700c4O)) {
                return null;
            }
            C997700c4O c997700c4O = (C997700c4O) iAdTranslatableData;
            return new C997610c4F(AbstractC1012230cRp.LIZIZ(c997700c4O.LIZ, c997700c4O.LIZJ, map), c997700c4O.LIZIZ, c997700c4O.LIZJ, AbstractC1012230cRp.LIZJ(c997700c4O.LIZLLL, map));
        }
    });
}
