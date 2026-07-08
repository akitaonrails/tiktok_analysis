package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.image.experiment.ImageCropConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0kpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1334320kpK extends AbstractC1334330kpL {
    @Override // X.AbstractC1334330kpL
    public final InterfaceC1325450kb1<Object, C03IT> LIZ() {
        C1334310kpJ c1334310kpJ = new InterfaceC1325450kb1<Object, C03IT>() { // from class: X.0kpJ
            public Pattern LIZ;
            public String LIZIZ;
            public boolean LIZJ;
            public boolean LIZLLL = true;

            public final Pattern LIZJ() {
                int i;
                String str;
                Pattern pattern = this.LIZ;
                if (pattern != null) {
                    return pattern;
                }
                try {
                    C0C64.LJIILLIIL().getClass();
                    ImageCropConfig imageCropConfig = (ImageCropConfig) C0C64.LJJI(ImageCropConfig.class, "image_crop_config_v3", true);
                    i = imageCropConfig != null ? imageCropConfig.tosImageShrinkType : 0;
                    str = imageCropConfig != null ? imageCropConfig.imageTosRegx : null;
                    this.LIZIZ = imageCropConfig != null ? imageCropConfig.tosImageFmt : null;
                    this.LIZLLL = i != 0;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL = false;
                }
                if (i == 2) {
                    if (!(str == null || str.length() == 0)) {
                        String str2 = this.LIZIZ;
                        if (!(str2 == null || str2.length() == 0)) {
                            this.LIZJ = true;
                            this.LIZ = PatternProtector.compile(str);
                            return this.LIZ;
                        }
                    }
                }
                this.LIZJ = false;
                return null;
            }

            {
                LIZJ();
            }

            @Override // X.InterfaceC1325450kb1
            public final C03IT LIZ(Object obj, C1331670kl3 c1331670kl3) {
                Matcher matcher;
                String strLIZIZ;
                if (!(obj instanceof ImageUrlModel)) {
                    return null;
                }
                int i = c1331670kl3.LJIIJJI;
                int i2 = c1331670kl3.LJIIL;
                ImageUrlModel imageUrlModel = (ImageUrlModel) obj;
                if (!this.LIZLLL) {
                    return new C03IT(imageUrlModel.getUrls());
                }
                if (i > 0 && i2 > 0) {
                    if (!this.LIZJ) {
                        LIZIZ(imageUrlModel, false, false);
                        return new C03IT(imageUrlModel.getUrls());
                    }
                    String uri = imageUrlModel.getUri();
                    if (uri != null && uri.length() != 0) {
                        if (u.LJJIIJZLJL(uri, "large/", false)) {
                            uri = u.LJJIII(uri, "large/", "", false);
                        }
                        List<String> urls = imageUrlModel.getUrls();
                        if (urls != null && !urls.isEmpty()) {
                            Pattern patternLIZJ = LIZJ();
                            if (patternLIZJ != null && (matcher = patternLIZJ.matcher(uri)) != null && matcher.matches()) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator<String> it2 = urls.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        Uri uri2 = UriProtector.parse(it2.next());
                                        String strK4 = C786410Ut5.k4(Locale.US, this.LIZIZ, Arrays.copyOf(new Object[]{uri2.getScheme(), uri2.getHost(), uri, Integer.valueOf(i), Integer.valueOf(i2)}, 5));
                                        if (a0.LJJIIZI(strK4, "?", false)) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(strK4);
                                            sbLIZ.append("&ilog=shrink");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(strK4);
                                            sbLIZ2.append("?ilog=shrink");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                        if (strLIZIZ != null) {
                                            linkedHashSet.add(strLIZIZ);
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                if (!linkedHashSet.isEmpty()) {
                                    urls.addAll(0, linkedHashSet);
                                }
                                return new C03IT(imageUrlModel.getUrls());
                            }
                            LIZIZ(imageUrlModel, true, true);
                            return new C03IT(imageUrlModel.getUrls());
                        }
                        return new C03IT(imageUrlModel.getUrls());
                    }
                    return new C03IT(imageUrlModel.getUrls());
                }
                return new C03IT(imageUrlModel.getUrls());
            }

            public static void LIZIZ(ImageUrlModel imageUrlModel, boolean z, boolean z2) {
                String str;
                ArrayList arrayList;
                String strLIZIZ;
                if (z && z2) {
                    str = "ilog=not_shrink_test";
                } else {
                    str = "ilog=not_shrink";
                }
                List<String> urls = imageUrlModel.getUrls();
                if (urls != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(urls, 10));
                    for (String str2 : urls) {
                        if (a0.LJJIIZI(str2, "?", false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str2);
                            sbLIZ.append('&');
                            sbLIZ.append(str);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str2);
                            sbLIZ2.append('?');
                            sbLIZ2.append(str);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        arrayList.add(strLIZIZ);
                    }
                } else {
                    arrayList = null;
                }
                imageUrlModel.setUrls(arrayList);
            }
        };
        return new InterfaceC1325450kb1<Object, C03IT>() { // from class: X.0kpJ
            public Pattern LIZ;
            public String LIZIZ;
            public boolean LIZJ;
            public boolean LIZLLL = true;

            public final Pattern LIZJ() {
                int i;
                String str;
                Pattern pattern = this.LIZ;
                if (pattern != null) {
                    return pattern;
                }
                try {
                    C0C64.LJIILLIIL().getClass();
                    ImageCropConfig imageCropConfig = (ImageCropConfig) C0C64.LJJI(ImageCropConfig.class, "image_crop_config_v3", true);
                    i = imageCropConfig != null ? imageCropConfig.tosImageShrinkType : 0;
                    str = imageCropConfig != null ? imageCropConfig.imageTosRegx : null;
                    this.LIZIZ = imageCropConfig != null ? imageCropConfig.tosImageFmt : null;
                    this.LIZLLL = i != 0;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZLLL = false;
                }
                if (i == 2) {
                    if (!(str == null || str.length() == 0)) {
                        String str2 = this.LIZIZ;
                        if (!(str2 == null || str2.length() == 0)) {
                            this.LIZJ = true;
                            this.LIZ = PatternProtector.compile(str);
                            return this.LIZ;
                        }
                    }
                }
                this.LIZJ = false;
                return null;
            }

            {
                LIZJ();
            }

            @Override // X.InterfaceC1325450kb1
            public final C03IT LIZ(Object obj, C1331670kl3 c1331670kl3) {
                Matcher matcher;
                String strLIZIZ;
                if (!(obj instanceof ImageUrlModel)) {
                    return null;
                }
                int i = c1331670kl3.LJIIJJI;
                int i2 = c1331670kl3.LJIIL;
                ImageUrlModel imageUrlModel = (ImageUrlModel) obj;
                if (!this.LIZLLL) {
                    return new C03IT(imageUrlModel.getUrls());
                }
                if (i > 0 && i2 > 0) {
                    if (!this.LIZJ) {
                        LIZIZ(imageUrlModel, false, false);
                        return new C03IT(imageUrlModel.getUrls());
                    }
                    String uri = imageUrlModel.getUri();
                    if (uri != null && uri.length() != 0) {
                        if (u.LJJIIJZLJL(uri, "large/", false)) {
                            uri = u.LJJIII(uri, "large/", "", false);
                        }
                        List<String> urls = imageUrlModel.getUrls();
                        if (urls != null && !urls.isEmpty()) {
                            Pattern patternLIZJ = LIZJ();
                            if (patternLIZJ != null && (matcher = patternLIZJ.matcher(uri)) != null && matcher.matches()) {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                Iterator<String> it2 = urls.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        Uri uri2 = UriProtector.parse(it2.next());
                                        String strK4 = C786410Ut5.k4(Locale.US, this.LIZIZ, Arrays.copyOf(new Object[]{uri2.getScheme(), uri2.getHost(), uri, Integer.valueOf(i), Integer.valueOf(i2)}, 5));
                                        if (a0.LJJIIZI(strK4, "?", false)) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(strK4);
                                            sbLIZ.append("&ilog=shrink");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(strK4);
                                            sbLIZ2.append("?ilog=shrink");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                        if (strLIZIZ != null) {
                                            linkedHashSet.add(strLIZIZ);
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                                if (!linkedHashSet.isEmpty()) {
                                    urls.addAll(0, linkedHashSet);
                                }
                                return new C03IT(imageUrlModel.getUrls());
                            }
                            LIZIZ(imageUrlModel, true, true);
                            return new C03IT(imageUrlModel.getUrls());
                        }
                        return new C03IT(imageUrlModel.getUrls());
                    }
                    return new C03IT(imageUrlModel.getUrls());
                }
                return new C03IT(imageUrlModel.getUrls());
            }

            public static void LIZIZ(ImageUrlModel imageUrlModel, boolean z, boolean z2) {
                String str;
                ArrayList arrayList;
                String strLIZIZ;
                if (z && z2) {
                    str = "ilog=not_shrink_test";
                } else {
                    str = "ilog=not_shrink";
                }
                List<String> urls = imageUrlModel.getUrls();
                if (urls != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(urls, 10));
                    for (String str2 : urls) {
                        if (a0.LJJIIZI(str2, "?", false)) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(str2);
                            sbLIZ.append('&');
                            sbLIZ.append(str);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str2);
                            sbLIZ2.append('?');
                            sbLIZ2.append(str);
                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        }
                        arrayList.add(strLIZIZ);
                    }
                } else {
                    arrayList = null;
                }
                imageUrlModel.setUrls(arrayList);
            }
        };
    }
}
