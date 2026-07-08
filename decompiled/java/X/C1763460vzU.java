package X;

import Y.ARunnableS53S0300000_20;
import android.view.View;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS0S1231000_26;

/* JADX INFO: renamed from: X.0vzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1763460vzU implements InterfaceC1762910vyb {
    public List<String> LIZ = new ArrayList();
    public final List<String> LIZIZ = new ArrayList();
    public final Map<String, C1763470vzV> LIZJ = new LinkedHashMap();
    public boolean LIZLLL = true;

    @Override // X.InterfaceC1762910vyb
    public final void Np(String str) {
        C1763470vzV c1763470vzV;
        if (str != null && (c1763470vzV = (C1763470vzV) C7726030a.LIZ(str, this.LIZJ)) != null) {
            c1763470vzV.LIZIZ = true;
        }
    }

    @Override // X.InterfaceC1762910vyb
    public final void Qe(String str) {
        if (str == null) {
            return;
        }
        if (this.LIZJ.containsKey(str)) {
            C1763470vzV c1763470vzV = (C1763470vzV) C7726030a.LIZ(str, this.LIZJ);
            if (c1763470vzV != null) {
                c1763470vzV.LIZ = false;
                c1763470vzV.LIZIZ = false;
                return;
            }
            return;
        }
        this.LIZJ.put(str, new C1763470vzV(0));
    }

    @Override // X.InterfaceC1762910vyb
    public final void et(String str) {
        C1763470vzV c1763470vzV;
        if (str != null && (c1763470vzV = (C1763470vzV) C7726030a.LIZ(str, this.LIZJ)) != null) {
            c1763470vzV.LIZ = true;
        }
    }

    @Override // X.InterfaceC1762910vyb
    public final void LIZ(View view, String str, List<Image> list, int i, Float f) {
        List<String> urls;
        String str2;
        List<String> urls2;
        String str3;
        List<String> urls3;
        String str4;
        if (view == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Image image = (Image) C13LP.LJJJLZIJ(i, list);
        if (image != null && (urls3 = image.getUrls()) != null && (str4 = (String) C13LP.LJJJLL(urls3)) != null) {
            String str5 = C1326840kdG.LIZ.LIZLLL(str4, false).LIZ;
            arrayList.add(str5);
            if (!((ArrayList) this.LIZ).contains(str5)) {
                LIZIZ(view, i, str, image, Boolean.valueOf(this.LIZLLL));
            }
        }
        if (f != null && f.floatValue() < 1.0f) {
            if (i != list.size() - 1) {
                int i2 = i + 1;
                Image image2 = (Image) C13LP.LJJJLZIJ(i2, list);
                if (image2 != null && (urls2 = image2.getUrls()) != null && (str3 = (String) C13LP.LJJJLL(urls2)) != null) {
                    String str6 = C1326840kdG.LIZ.LIZLLL(str3, false).LIZ;
                    arrayList.add(str6);
                    if (!((ArrayList) this.LIZ).contains(str6)) {
                        LIZIZ(view, i2, str, image2, Boolean.valueOf(this.LIZLLL));
                    }
                }
            } else {
                int i3 = i - 1;
                Image image3 = (Image) C13LP.LJJJLZIJ(i3, list);
                if (image3 != null && (urls = image3.getUrls()) != null && (str2 = (String) C13LP.LJJJLL(urls)) != null) {
                    String str7 = C1326840kdG.LIZ.LIZLLL(str2, false).LIZ;
                    arrayList.add(str7);
                    if (!((ArrayList) this.LIZ).contains(str7)) {
                        LIZIZ(view, i3, str, image3, Boolean.valueOf(this.LIZLLL));
                    }
                }
            }
        }
        this.LIZLLL = false;
        this.LIZ = arrayList;
    }

    public final void LIZIZ(final View view, final int i, String str, Image image, final Boolean bool) {
        List<String> urls;
        String str2;
        final boolean z;
        if (str != null && (urls = image.getUrls()) != null && (str2 = (String) C13LP.LJJJLL(urls)) != null) {
            final boolean z2 = false;
            final String str3 = C1326840kdG.LIZ.LIZLLL(str2, false).LIZ;
            if (str3.length() == 0) {
                return;
            }
            final boolean zContains = ((ArrayList) this.LIZIZ).contains(str3);
            ((ArrayList) this.LIZIZ).add(str3);
            Map<String, C1763470vzV> map = this.LIZJ;
            String uri = image.getUri();
            String str4 = "";
            if (uri == null) {
                uri = "";
            }
            C1763470vzV c1763470vzV = (C1763470vzV) ((LinkedHashMap) map).get(uri);
            if (c1763470vzV != null) {
                z = c1763470vzV.LIZ;
            } else {
                C01GW c01gw = C1066190dqr.LIZ;
                if (C1066190dqr.LJIIIIZZ(str, image.getUri()) != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            Map<String, C1763470vzV> map2 = this.LIZJ;
            String uri2 = image.getUri();
            if (uri2 != null) {
                str4 = uri2;
            }
            C1763470vzV c1763470vzV2 = (C1763470vzV) ((LinkedHashMap) map2).get(str4);
            if (c1763470vzV2 != null) {
                z2 = c1763470vzV2.LIZIZ;
            }
            C1260120ite.LIZ(new ARunnableS53S0300000_20(this, UriProtector.parse(str3), new InterfaceC442640HXi() { // from class: X.0vzY
                @Override // X.InterfaceC442640HXi
                public final void onResult(Object obj) {
                    C1748720vbi.LIZLLL(view, new C1763520vza(), new AwS0S1231000_26(str3, i, z, z2, (Integer) obj, zContains, bool, 0));
                }
            }, 44));
        }
    }
}
