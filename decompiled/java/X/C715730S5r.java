package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Audio;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.TtsInfos;
import com.ss.android.ugc.aweme.translation.service.IAutoDubbingService;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0S5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C715730S5r {
    public final List<InterfaceC715720S5q> LIZ = C1697810uHb.LJIIJJI(new InterfaceC715720S5q() { // from class: X.15zZ
        @Override // X.InterfaceC715720S5q
        public final List<InterfaceC1282004zy> LIZ(WeakReference<Context> weakReference, Aweme aweme, String str, long j) {
            Integer numValueOf;
            boolean z;
            InterfaceC0241006d c017b;
            boolean z2;
            String str2;
            Integer num;
            InterfaceC0241006d[] interfaceC0241006dArr = new InterfaceC0241006d[4];
            interfaceC0241006dArr[0] = C161N.LIZIZ.LJJIJIIJIL(weakReference, aweme, str);
            String strLJJJ = null;
            if (C1ER1.LIZIZ.LJJJLL(str)) {
                numValueOf = Integer.valueOf(C584460Mw8.LIZ ? 1 : 0);
            } else {
                numValueOf = null;
            }
            String strLIZ = C293250BeV.LIZ();
            Double dValueOf = Double.valueOf(C2179771ASp.LJIIIIZZ());
            C20703015zo c20703015zo = C20703015zo.LIZ;
            Context context = weakReference.get();
            if (context != null && C0SXF.LJIL(context)) {
                z = true;
            } else {
                z = false;
            }
            c20703015zo.getClass();
            interfaceC0241006dArr[1] = new C225600ty(numValueOf, strLIZ, dValueOf, Integer.valueOf(C20703015zo.LIZ(aweme, false, z, false) ? 1 : 0));
            C651970Phj.LLILLL.getClass();
            Map mapLIZJ = C651980Phk.LIZJ();
            if (mapLIZJ.isEmpty()) {
                c017b = null;
            } else {
                String str3 = (String) mapLIZJ.get("search_keyword");
                String str4 = "";
                if (str3 == null) {
                    str3 = "";
                }
                String str5 = (String) mapLIZJ.get("search_id");
                if (str5 == null) {
                    str5 = "";
                }
                String str6 = (String) mapLIZJ.get("search_type");
                if (str6 != null) {
                    str4 = str6;
                }
                c017b = new C017B(str3, str5, str4);
            }
            interfaceC0241006dArr[2] = c017b;
            Integer num2 = 0;
            if (C20702515zj.LIZ(aweme, null) || ((aweme != null && C13LQ.LJIILLIIL(C0SKF.LIZJ(aweme), C0SCU.LIZ().LL())) || C161F.LJ(aweme) || (aweme != null && C13LQ.LJIILLIIL(C20701315zX.LIZ(aweme), C0SCU.LIZ().LL())))) {
                z2 = true;
            } else {
                z2 = false;
            }
            C20703515zt.LIZ.getClass();
            C161N c161n = C20703515zt.LIZIZ;
            if (!c161n.LJIJI(aweme)) {
                if (C746760TRa.LIZ().LJLILLLLZI()) {
                    str2 = "on";
                } else {
                    str2 = "off";
                }
            } else {
                str2 = null;
            }
            C2792016g c2792016g = new C2792016g(0);
            c2792016g.LL = str2;
            if (z2) {
                num = 1;
            } else {
                num = num2;
            }
            c2792016g.LLILZIL = num;
            c2792016g.LLILZLL = C13LQ.LJJJ(c161n.LL(), ",", null, null, null, 62);
            if (C294270Bg9.LIZ()) {
                C1839820xye.LIZ().LJIIIIZZ().getClass();
                String[] strArrLIZ = C20700315zN.LIZ();
                if (strArrLIZ != null) {
                    strLJJJ = C13LQ.LJJJ(strArrLIZ, ",", null, null, null, 62);
                }
                c2792016g.LLIZ = strLJJJ;
                if (z2) {
                    C1839820xye.LIZ().LJIIIIZZ().getClass();
                    if (C20700315zN.LIZ() != null) {
                        num2 = 1;
                    }
                }
                c2792016g.LLILZ = num2;
            }
            interfaceC0241006dArr[3] = c2792016g;
            return C13LP.LJJJJLI(C1697810uHb.LJIIJJI(interfaceC0241006dArr));
        }
    }, new InterfaceC715720S5q() { // from class: X.160Y
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x019b  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x019e  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x01a5  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // X.InterfaceC715720S5q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<X.InterfaceC1282004zy> LIZ(java.lang.ref.WeakReference<android.content.Context> r27, com.ss.android.ugc.aweme.feed.model.Aweme r28, java.lang.String r29, long r30) {
            /*
                Method dump skipped, instruction units count: 431
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C160Y.LIZ(java.lang.ref.WeakReference, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, long):java.util.List");
        }
    }, new InterfaceC715720S5q() { // from class: X.161E
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // X.InterfaceC715720S5q
        public final List<InterfaceC1282004zy> LIZ(WeakReference<Context> weakReference, Aweme aweme, String str, long j) {
            String str2;
            Object obj;
            Object obj2;
            Object obj3;
            if (AwemeExtKt.isPhotoMode(aweme)) {
                return C13BV.INSTANCE;
            }
            boolean zLIZLLL = C161F.LIZLLL(aweme.getInteractStickerStructs());
            int i = 0;
            C2789016d c2789016d = new C2789016d(0);
            if (C746760TRa.LIZ().LJJJJI()) {
                str2 = "on";
            } else {
                str2 = "off";
            }
            c2789016d.LLILZ = str2;
            if (!zLIZLLL) {
                return C1697810uHb.LJIIJJI(new C2796016k(i), c2789016d);
            }
            List listLIZJ = C161F.LIZJ(aweme, aweme.getInteractStickerStructs());
            if (listLIZJ.size() > 0) {
                obj = ListProtector.get(listLIZJ, 0);
            } else {
                obj = 0;
            }
            int iIntValue = ((Number) obj).intValue();
            boolean zLLIIII = C0SCU.LIZ().LLIIII(aweme, false);
            C161N c161n = C161N.LIZIZ;
            boolean zLJZI = c161n.LJZI(aweme);
            String strLIZIZ = C161F.LIZIZ(aweme);
            if (1 < listLIZJ.size()) {
                obj2 = ListProtector.get(listLIZJ, 1);
            } else {
                obj2 = 0;
            }
            int iIntValue2 = ((Number) obj2).intValue();
            if (2 < listLIZJ.size()) {
                obj3 = ListProtector.get(listLIZJ, 2);
            } else {
                obj3 = 0;
            }
            C2796016k c2796016k = new C2796016k(1, iIntValue, iIntValue2, ((Number) obj3).intValue(), Integer.valueOf(zLLIIII ? 1 : 0), Integer.valueOf(zLJZI ? 1 : 0), strLIZIZ, "");
            c2789016d.LL = Integer.valueOf(c161n.LLFZ(aweme));
            if (c161n.LJJIFFI(zLLIIII, zLIZLLL)) {
                c2789016d.LLILLJJLI = c161n.LJJIJIIJI(aweme);
            }
            if (c161n.LJL(zLLIIII, zLJZI)) {
                c2789016d.LLILLL = c161n.LLIIL(aweme);
            }
            return C1697810uHb.LJIIJJI(c2796016k, c2789016d);
        }
    }, new InterfaceC715720S5q() { // from class: X.1609
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v0 */
        /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r7v0 */
        /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r7v2 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // X.InterfaceC715720S5q
        public final List<InterfaceC1282004zy> LIZ(WeakReference<Context> weakReference, Aweme aweme, String str, long j) {
            boolean z;
            int i;
            boolean z2;
            ?? r7;
            ?? r6;
            boolean zLJJIJIIJIL;
            boolean z3;
            int i2;
            String str2;
            String str3;
            String strLJJIFFI;
            int i3;
            String str4;
            String str5;
            String str6;
            if (C20703515zt.LJIIIIZZ(aweme) != null) {
                z = true;
            } else {
                z = false;
            }
            C2791016f c2791016f = new C2791016f(null, null, 255);
            String str7 = "off";
            if (!AwemeExtKt.isPhotoMode(aweme)) {
                if (Intrinsics.LJFF(C746760TRa.LIZ().LJJIII().getValue(), Boolean.TRUE)) {
                    str6 = "on";
                } else {
                    str6 = "off";
                }
                c2791016f.LL = str6;
            }
            if (!z) {
                return C1697810uHb.LJIIJJI(new C016X(0, null, null, null, null, null, null, null, null, null, null, null, null, 8191), c2791016f);
            }
            if (C20703515zt.LJI(aweme) != null && (!r5.isEmpty())) {
                i = 1;
            } else {
                i = 0;
            }
            C20703515zt.LIZ.getClass();
            if (C20703515zt.LJJIFFI(aweme, false) && !C20703515zt.LJJIIJZLJL(aweme)) {
                z2 = true;
            } else {
                z2 = false;
            }
            C161N c161n = C20703515zt.LIZIZ;
            if ((!c161n.LJIILL(aweme, null, null) || !C746760TRa.LIZ().LJLILLLLZI()) && !z2) {
                r7 = 0;
            } else {
                r7 = 1;
            }
            if (!C20702515zj.LIZIZ(aweme) && r7 == 0) {
                r6 = 0;
            } else {
                r6 = 1;
            }
            boolean zLJJIIZI = C20703515zt.LJJIIZI(aweme, null);
            boolean zLJIL = C20703515zt.LJIL(aweme);
            if (aweme == null) {
                zLJJIJIIJIL = false;
            } else {
                zLJJIJIIJIL = C20703515zt.LJJIJIIJIL(aweme, false);
            }
            if (!z2 && !C20703515zt.LJJIFFI(aweme, true)) {
                z3 = false;
            } else {
                z3 = true;
            }
            String strLJIIJJI = C20703515zt.LJIIJJI(aweme);
            if (i != 0) {
                if (!zLJJIIZI && zLJIL) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            } else {
                i2 = 0;
            }
            Integer numValueOf = Integer.valueOf(i2);
            if (!zLJJIJIIJIL && !z3) {
                str2 = "hidden";
            } else {
                str2 = "captions";
            }
            String strLJIILIIL = C20703515zt.LJIILIIL(aweme);
            Integer numValueOf2 = Integer.valueOf((int) r6);
            Integer numValueOf3 = Integer.valueOf((int) r7);
            CaptionItemModel captionItemModelLIZLLL = C20702515zj.LIZLLL(aweme);
            if (captionItemModelLIZLLL != null) {
                if (captionItemModelLIZLLL.translationType == 1) {
                    str3 = "user_edit";
                } else {
                    str3 = "auto";
                }
            } else {
                str3 = null;
            }
            Integer numValueOf4 = Integer.valueOf(i);
            String str8 = "";
            if (i != 0) {
                strLJJIFFI = u.LJJIFFI(u.LJJIFFI(String.valueOf(C20703515zt.LJI(aweme)), e3.e, "", false), e3.f, "", false);
            } else {
                strLJJIFFI = null;
            }
            if (zLJJIIZI && zLJIL) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            C016X c016x = new C016X(1, strLJIIJJI, numValueOf, str2, strLJIILIIL, null, numValueOf2, numValueOf3, null, str3, numValueOf4, strLJJIFFI, Integer.valueOf(i3), 288);
            if (zLJJIJIIJIL) {
                str7 = "on";
            }
            c2791016f.LL = str7;
            C161N c161n2 = C161N.LIZIZ;
            c2791016f.LLILLJJLI = Integer.valueOf(c161n2.LJJJJI(aweme));
            if (c161n2.LJJIFFI(r6, z)) {
                c2791016f.LLILLL = c161n2.LJLILLLLZI(aweme);
            }
            if (c161n2.LJL(r6, r7)) {
                c2791016f.LLILZ = c161n2.LJJI(aweme);
            }
            CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme);
            if (captionItemModelLJIIIIZZ != null) {
                str4 = captionItemModelLJIIIIZZ.variant;
            } else {
                str4 = null;
            }
            c2791016f.LLILZIL = str4;
            CaptionItemModel captionItemModelLJIIIIZZ2 = C20703515zt.LJIIIIZZ(aweme);
            if (captionItemModelLJIIIIZZ2 != null && (str5 = captionItemModelLJIIIIZZ2.versionType) != null) {
                str8 = str5;
            }
            c2791016f.LLILZLL = str8;
            C160X c160xLJFF = C1485670olR.LIZ().LJFF(aweme, "realtime_caption");
            if (c160xLJFF != null && Intrinsics.LJFF(c160xLJFF.LIZIZ, c161n.LLIIZ())) {
                c2791016f.LLIZLLLIL = Long.valueOf(j - c160xLJFF.LIZ);
            }
            return C1697810uHb.LJIIJJI(c016x, c2791016f);
        }
    }, new InterfaceC715720S5q() { // from class: X.0S5p
        @Override // X.InterfaceC715720S5q
        public final List<InterfaceC1282004zy> LIZ(WeakReference<Context> weakReference, Aweme aweme, String str, long j) {
            return Collections.singletonList(C720370SNn.LIZ(aweme));
        }
    }, new InterfaceC715720S5q() { // from class: X.161B
        /* JADX WARN: Removed duplicated region for block: B:31:0x00be  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // X.InterfaceC715720S5q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<X.InterfaceC1282004zy> LIZ(java.lang.ref.WeakReference<android.content.Context> r16, com.ss.android.ugc.aweme.feed.model.Aweme r17, java.lang.String r18, long r19) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C161B.LIZ(java.lang.ref.WeakReference, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, long):java.util.List");
        }
    }, new InterfaceC715720S5q() { // from class: X.0S5n
        @Override // X.InterfaceC715720S5q
        public final List<InterfaceC1282004zy> LIZ(WeakReference<Context> weakReference, Aweme aweme, String str, long j) {
            int i;
            boolean z;
            TtsInfos ttsInfos;
            Audio audio;
            List<TtsInfos> ttsInfos2;
            TtsInfos next;
            Audio audio2;
            List<TtsInfos> ttsInfos3;
            IAutoDubbingService iAutoDubbingServiceLIZ;
            List<TtsInfos> ttsInfos4;
            Audio audio3 = aweme.getAudio();
            int i2 = 1;
            if (audio3 != null && (ttsInfos4 = audio3.getTtsInfos()) != null && (!ttsInfos4.isEmpty())) {
                i = 1;
            } else {
                i = 0;
            }
            String strLLIIZ = C161N.LIZIZ.LLIIZ();
            if (C299190Bo5.LIZ() && (iAutoDubbingServiceLIZ = C0RT5.LIZ()) != null && iAutoDubbingServiceLIZ.LIZIZ(aweme)) {
                z = true;
            } else {
                z = false;
            }
            if (C1481040ody.LIZ() && !z && (audio2 = aweme.getAudio()) != null && (ttsInfos3 = audio2.getTtsInfos()) != null && !ttsInfos3.isEmpty()) {
                Iterator<TtsInfos> it2 = ttsInfos3.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(it2.next().languageCode, strLLIIZ)) {
                        break;
                    }
                }
                i2 = 0;
            } else {
                i2 = 0;
            }
            String str2 = null;
            if (C295340Bhs.LIZ() && (audio = aweme.getAudio()) != null && (ttsInfos2 = audio.getTtsInfos()) != null) {
                Iterator<TtsInfos> it3 = ttsInfos2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next = it3.next();
                        if (Intrinsics.LJFF(next.languageCode, C161N.LIZIZ.LLIIZ())) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ttsInfos = next;
            } else {
                ttsInfos = null;
            }
            if (i2 == 0) {
                strLLIIZ = "";
            }
            if (C295340Bhs.LIZ() && ttsInfos != null) {
                str2 = ttsInfos.voiceType;
            }
            return Collections.singletonList(new C2739014f(i, i2, strLLIIZ, str2));
        }
    }, new InterfaceC715720S5q() { // from class: X.0S5o
        /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[PHI: r2
          0x003c: PHI (r2v3 int) = (r2v1 int), (r2v0 int) binds: [B:14:0x0023, B:11:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.InterfaceC715720S5q
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List<X.InterfaceC1282004zy> LIZ(java.lang.ref.WeakReference<android.content.Context> r4, com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.String r6, long r7) {
            /*
                r3 = this;
                boolean r0 = X.C299190Bo5.LIZ()
                if (r0 != 0) goto L9
                X.13BV r0 = X.C13BV.INSTANCE
                return r0
            L9:
                com.ss.android.ugc.aweme.translation.service.IAutoDubbingService r0 = X.C0RT5.LIZ()
                r2 = 0
                if (r0 == 0) goto L3e
                boolean r1 = r0.LIZIZ(r5)
            L14:
                com.ss.android.ugc.aweme.service.ICLACaptionService r0 = X.C0RT2.LIZ()
                boolean r0 = r0.LJ(r5)
                if (r1 != 0) goto L20
                if (r0 == 0) goto L3c
            L20:
                r2 = 1
                if (r1 != 0) goto L25
                if (r0 == 0) goto L3c
            L25:
                X.161N r0 = X.C161N.LIZIZ
                boolean r0 = r0.LJJLIIIJLJLI()
                if (r0 == 0) goto L39
                java.lang.String r1 = "manual_dnt"
            L2f:
                X.003S r0 = new X.003S
                r0.<init>(r2, r1)
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            L39:
                java.lang.String r1 = "user_lang_model"
                goto L2f
            L3c:
                r1 = 0
                goto L2f
            L3e:
                r1 = 0
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C715700S5o.LIZ(java.lang.ref.WeakReference, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, long):java.util.List");
        }
    });
}
