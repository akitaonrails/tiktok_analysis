package X;

import com.bytedance.ies.nleeditor.NLE;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0nI7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429050nI7 {
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static final C1429050nI7 LIZ = new C1429050nI7();
    public static final Map<TemplateScene, InterfaceC1429080nIA> LIZIZ = C2097608Jq.LJIIJ(new Pair(TemplateScene.AUTO_CUT, new InterfaceC1429080nIA() { // from class: X.1EOC
        @Override // X.InterfaceC1429080nIA
        public final List<String> LIZJ() {
            ArrayList arrayList = new ArrayList();
            C1432940nOO.LIZ.getClass();
            if (!C1432940nOO.LJII()) {
                arrayList.add("CMP");
            }
            List listLIZ = C0CI7.LIZ();
            C0CI4 c0ci4 = C0CI4.AUTOCUT_LIST;
            if (listLIZ.contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_ADJUST");
            }
            if (C0CIE.LIZ().contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_SANI");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CIA.LIZ())) {
                arrayList.add("UGC_FC");
            }
            if (C0CI6.LIZ().contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_KEYFRAME");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI8.LIZ())) {
                arrayList.add("MULTIPLE_FILTERS");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI9.LIZ())) {
                arrayList.add("UGC_CS");
            }
            if (!C0CI5.LIZ(c0ci4)) {
                arrayList.add("UGC_STICKER");
            }
            if (!C0CIH.LIZ(c0ci4)) {
                arrayList.add("UGC_MAGIC_V1");
            }
            if (!C0CIG.LIZ(c0ci4)) {
                arrayList.add("UGC_MAGIC_V2");
            }
            if (!C0CII.LIZ(c0ci4)) {
                arrayList.add("TEMPLATE_MATTING");
            }
            if (!C0CIB.LIZ(c0ci4)) {
                arrayList.add("UGC_ASYNC_I2V");
            }
            if (!C0CID.LIZ(c0ci4)) {
                arrayList.add("UGC_PIP");
            }
            if (!C0CIF.LIZ(c0ci4)) {
                arrayList.add("UGC_LM");
            }
            if (!C0CIC.LIZ(c0ci4)) {
                arrayList.add("UGC_MULTI_MUSIC");
            }
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<String, String> LJ() {
            return C1429090nIB.LJI(this);
        }

        @Override // X.InterfaceC1429080nIA
        public final TemplateScene scene() {
            return TemplateScene.AUTO_CUT;
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LJFF(C1429030nI5 c1429030nI5) {
            List<String> listLJIILJJIL = C1697810uHb.LJIILJJIL("TEMPLATE_MATTING");
            List listLIZ = C0CI7.LIZ();
            C0CI4 c0ci4 = C0CI4.AUTOCUT_LIST;
            if (listLIZ.contains(c0ci4.getSceneName())) {
                listLJIILJJIL.add("UGC_ADJUST");
            }
            if (C0CIE.LIZ().contains(c0ci4.getSceneName())) {
                listLJIILJJIL.add("UGC_SANI");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CIA.LIZ())) {
                listLJIILJJIL.add("UGC_FC");
            }
            if (C0CI6.LIZ().contains(c0ci4.getSceneName())) {
                listLJIILJJIL.add("UGC_KEYFRAME");
            }
            if (!C0CIH.LIZ(c0ci4)) {
                listLJIILJJIL.add("UGC_MAGIC_V1");
            }
            if (!C0CIG.LIZ(c0ci4)) {
                listLJIILJJIL.add("UGC_MAGIC_V2");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI8.LIZ())) {
                listLJIILJJIL.add("MULTIPLE_FILTERS");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI9.LIZ())) {
                listLJIILJJIL.add("UGC_CS");
            }
            if (!C0CI5.LIZ(c0ci4)) {
                listLJIILJJIL.add("UGC_STICKER");
            }
            if (!C0CII.LIZ(c0ci4)) {
                listLJIILJJIL.add("TEMPLATE_MATTING");
            }
            if (!C0CIB.LIZ(c0ci4)) {
                listLJIILJJIL.add("UGC_ASYNC_I2V");
            }
            if (!C0CID.LIZ(c0ci4)) {
                listLJIILJJIL.add("UGC_PIP");
            }
            if (!C0CIF.LIZ(c0ci4)) {
                listLJIILJJIL.add("UGC_LM");
            }
            if (!C0CIC.LIZ(c0ci4)) {
                listLJIILJJIL.add("UGC_MULTI_MUSIC");
            }
            return listLJIILJJIL;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<Integer, Integer> LIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final boolean LIZIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<Integer> LIZLLL(List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZLLL(this, list, arrayList, c1429030nI5);
        }
    }), new Pair(TemplateScene.TEMPLATE_TAB, new InterfaceC1429080nIA() { // from class: X.1EOD
        @Override // X.InterfaceC1429080nIA
        public final List<String> LIZJ() {
            ArrayList arrayList = new ArrayList();
            List listLIZ = C0CI6.LIZ();
            C0CI4 c0ci4 = C0CI4.TEMPLATE_TAB;
            if (listLIZ.contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_KEYFRAME");
            }
            if (C0CI7.LIZ().contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_ADJUST");
            }
            if (C0CIE.LIZ().contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_SANI");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CIA.LIZ())) {
                arrayList.add("UGC_FC");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI8.LIZ())) {
                arrayList.add("MULTIPLE_FILTERS");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI9.LIZ())) {
                arrayList.add("UGC_CS");
            }
            if (!C0CI5.LIZ(c0ci4)) {
                arrayList.add("UGC_STICKER");
            }
            if (!C0CIH.LIZ(c0ci4)) {
                arrayList.add("UGC_MAGIC_V1");
            }
            if (!C0CIG.LIZ(c0ci4)) {
                arrayList.add("UGC_MAGIC_V2");
            }
            if (!C0CII.LIZ(c0ci4)) {
                arrayList.add("TEMPLATE_MATTING");
            }
            if (!C0CIB.LIZ(c0ci4)) {
                arrayList.add("UGC_ASYNC_I2V");
            }
            if (!C0CID.LIZ(c0ci4)) {
                arrayList.add("UGC_PIP");
            }
            if (!C0CIF.LIZ(c0ci4)) {
                arrayList.add("UGC_LM");
            }
            if (!C0CIC.LIZ(c0ci4)) {
                arrayList.add("UGC_MULTI_MUSIC");
            }
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<String, String> LJ() {
            return C1429090nIB.LJI(this);
        }

        @Override // X.InterfaceC1429080nIA
        public final TemplateScene scene() {
            return TemplateScene.TEMPLATE_TAB;
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LJFF(C1429030nI5 c1429030nI5) {
            ArrayList arrayList = new ArrayList();
            List listLIZ = C0CI6.LIZ();
            C0CI4 c0ci4 = C0CI4.TEMPLATE_TAB;
            if (listLIZ.contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_KEYFRAME");
            }
            if (C0CI7.LIZ().contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_ADJUST");
            }
            if (C0CIE.LIZ().contains(c0ci4.getSceneName())) {
                arrayList.add("UGC_SANI");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CIA.LIZ())) {
                arrayList.add("UGC_FC");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI8.LIZ())) {
                arrayList.add("MULTIPLE_FILTERS");
            }
            if (C13LQ.LJIILLIIL(c0ci4.getSceneName(), C0CI9.LIZ())) {
                arrayList.add("UGC_CS");
            }
            if (!C0CI5.LIZ(c0ci4)) {
                arrayList.add("UGC_STICKER");
            }
            if (!C0CIH.LIZ(c0ci4)) {
                arrayList.add("UGC_MAGIC_V1");
            }
            if (!C0CIG.LIZ(c0ci4)) {
                arrayList.add("UGC_MAGIC_V2");
            }
            if (!C0CII.LIZ(c0ci4)) {
                arrayList.add("TEMPLATE_MATTING");
            }
            if (!C0CIB.LIZ(c0ci4)) {
                arrayList.add("UGC_ASYNC_I2V");
            }
            if (!C0CID.LIZ(c0ci4)) {
                arrayList.add("UGC_PIP");
            }
            if (!C0CIF.LIZ(c0ci4)) {
                arrayList.add("UGC_LM");
            }
            if (!C0CIC.LIZ(c0ci4)) {
                arrayList.add("UGC_MULTI_MUSIC");
            }
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<Integer, Integer> LIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final boolean LIZIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<Integer> LIZLLL(List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZLLL(this, list, arrayList, c1429030nI5);
        }
    }), new Pair(TemplateScene.PUGC, new InterfaceC1429080nIA() { // from class: X.1EOB
        @Override // X.InterfaceC1429080nIA
        public final List<String> LIZJ() {
            ArrayList arrayList = new ArrayList();
            String[] strArr = C0CII.LIZ;
            C0CI4 c0ci4 = C0CI4.TEMPLATE_ANCHOR;
            if (!C0CII.LIZ(c0ci4)) {
                arrayList.add(C1EO8.TEMPLATE_MATTING.getValue());
            }
            if (C0CI6.LIZIZ()) {
                arrayList.add(C1EO8.UGC_KEYFRAME.getValue());
            }
            if (C0CI7.LIZIZ()) {
                arrayList.add(C1EO8.UGC_ADJUST.getValue());
            }
            if (C0CIE.LIZIZ()) {
                arrayList.add(C1EO8.UGC_SUBTITLE_ANIMATION.getValue());
            }
            if (C0CIA.LIZIZ()) {
                arrayList.add(C1EO8.UGC_FLOWER_CHAR.getValue());
            }
            if (!C0CIH.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V1.getValue());
            }
            if (!C0CIG.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V2.getValue());
            }
            if (C0CI8.LIZIZ()) {
                arrayList.add(C1EO8.MULTIPLE_FILTERS.getValue());
            }
            if (C0CI9.LIZIZ()) {
                arrayList.add(C1EO8.UGC_CURVE_SPEED.getValue());
            }
            if (!C0CI5.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_STICKER.getValue());
            }
            if (!C0CIB.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_ASYNC_I2V.getValue());
            }
            if (!C0CID.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_PIP.getValue());
            }
            if (!C0CIF.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_LOT_MATERIAL.getValue());
            }
            if (!C0CIC.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MULTI_MUSIC.getValue());
            }
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<String, String> LJ() {
            return C1429090nIB.LJI(this);
        }

        @Override // X.InterfaceC1429080nIA
        public final TemplateScene scene() {
            return TemplateScene.PUGC;
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LJFF(C1429030nI5 c1429030nI5) {
            Object obj;
            Object next;
            Iterator<Object> it2 = c1429030nI5.LIZ.iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof C1429040nI6) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next instanceof C1429040nI6) {
                obj = next;
            }
            C1429040nI6 c1429040nI6 = (C1429040nI6) obj;
            if (c1429040nI6 != null && c1429040nI6.LIZ) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            String[] strArr = C0CII.LIZ;
            C0CI4 c0ci4 = C0CI4.TEMPLATE_ANCHOR;
            if (!C0CII.LIZ(c0ci4)) {
                arrayList.add(C1EO8.TEMPLATE_MATTING.getValue());
            }
            if (C0CI6.LIZIZ()) {
                arrayList.add(C1EO8.UGC_KEYFRAME.getValue());
            }
            if (C0CI7.LIZIZ()) {
                arrayList.add(C1EO8.UGC_ADJUST.getValue());
            }
            if (C0CIE.LIZIZ()) {
                arrayList.add(C1EO8.UGC_SUBTITLE_ANIMATION.getValue());
            }
            if (C0CIA.LIZIZ()) {
                arrayList.add(C1EO8.UGC_FLOWER_CHAR.getValue());
            }
            if (!C0CIH.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V1.getValue());
            }
            if (!C0CIG.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V2.getValue());
            }
            if (C0CI8.LIZIZ()) {
                arrayList.add(C1EO8.MULTIPLE_FILTERS.getValue());
            }
            if (C0CI9.LIZIZ()) {
                arrayList.add(C1EO8.UGC_CURVE_SPEED.getValue());
            }
            if (!C0CI5.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_STICKER.getValue());
            }
            if (!C0CIB.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_ASYNC_I2V.getValue());
            }
            if (!C0CID.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_PIP.getValue());
            }
            if (!C0CIF.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_LOT_MATERIAL.getValue());
            }
            if (true ^ C0CIC.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MULTI_MUSIC.getValue());
            }
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<Integer, Integer> LIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final boolean LIZIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<Integer> LIZLLL(List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZLLL(this, list, arrayList, c1429030nI5);
        }
    }), new Pair(TemplateScene.UGC, new InterfaceC1429080nIA() { // from class: X.1EOA
        @Override // X.InterfaceC1429080nIA
        public final List<String> LIZJ() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C1EO8.TEMPLATE_MATTING.getValue());
            if (C0CI6.LIZIZ()) {
                arrayList.add(C1EO8.UGC_KEYFRAME.getValue());
            }
            if (C0CI7.LIZIZ()) {
                arrayList.add(C1EO8.UGC_ADJUST.getValue());
            }
            if (C0CIE.LIZIZ()) {
                arrayList.add(C1EO8.UGC_SUBTITLE_ANIMATION.getValue());
            }
            if (C0CIA.LIZIZ()) {
                arrayList.add(C1EO8.UGC_FLOWER_CHAR.getValue());
            }
            if (C0CI8.LIZIZ()) {
                arrayList.add(C1EO8.MULTIPLE_FILTERS.getValue());
            }
            String[] strArr = C0CIH.LIZ;
            C0CI4 c0ci4 = C0CI4.TEMPLATE_ANCHOR;
            if (!C0CIH.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V1.getValue());
            }
            if (!C0CIG.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V2.getValue());
            }
            if (C0CI9.LIZIZ()) {
                arrayList.add(C1EO8.UGC_CURVE_SPEED.getValue());
            }
            if (!C0CI5.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_STICKER.getValue());
            }
            if (!C0CID.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_PIP.getValue());
            }
            if (!C0CIC.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MULTI_MUSIC.getValue());
            }
            arrayList.add(C1EO8.UGC_ASYNC_I2V.getValue());
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<String, String> LJ() {
            return C1429090nIB.LJI(this);
        }

        @Override // X.InterfaceC1429080nIA
        public final TemplateScene scene() {
            return TemplateScene.UGC;
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LJFF(C1429030nI5 c1429030nI5) {
            Object obj;
            Object next;
            Iterator<Object> it2 = c1429030nI5.LIZ.iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof C1429040nI6) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next instanceof C1429040nI6) {
                obj = next;
            }
            C1429040nI6 c1429040nI6 = (C1429040nI6) obj;
            if (c1429040nI6 != null && c1429040nI6.LIZ) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(C1EO8.TEMPLATE_MATTING.getValue());
            if (C0CI6.LIZIZ()) {
                arrayList.add(C1EO8.UGC_KEYFRAME.getValue());
            }
            if (C0CI7.LIZIZ()) {
                arrayList.add(C1EO8.UGC_ADJUST.getValue());
            }
            if (C0CIE.LIZIZ()) {
                arrayList.add(C1EO8.UGC_SUBTITLE_ANIMATION.getValue());
            }
            if (C0CIA.LIZIZ()) {
                arrayList.add(C1EO8.UGC_FLOWER_CHAR.getValue());
            }
            if (C0CI8.LIZIZ()) {
                arrayList.add(C1EO8.MULTIPLE_FILTERS.getValue());
            }
            String[] strArr = C0CIH.LIZ;
            C0CI4 c0ci4 = C0CI4.TEMPLATE_ANCHOR;
            if (!C0CIH.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V1.getValue());
            }
            if (!C0CIG.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MAGIC_V2.getValue());
            }
            if (C0CI9.LIZIZ()) {
                arrayList.add(C1EO8.UGC_CURVE_SPEED.getValue());
            }
            if (!C0CI5.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_STICKER.getValue());
            }
            if (!C0CID.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_PIP.getValue());
            }
            if (true ^ C0CIC.LIZ(c0ci4)) {
                arrayList.add(C1EO8.UGC_MULTI_MUSIC.getValue());
            }
            arrayList.add(C1EO8.UGC_ASYNC_I2V.getValue());
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<Integer, Integer> LIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final boolean LIZIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<Integer> LIZLLL(List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZLLL(this, list, arrayList, c1429030nI5);
        }
    }), new Pair(TemplateScene.PIC_UGC, new InterfaceC1429080nIA() { // from class: X.0nIE
        @Override // X.InterfaceC1429080nIA
        public final Pair<String, String> LJ() {
            return C1429090nIB.LJI(this);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LIZJ() {
            return C13BV.INSTANCE;
        }

        @Override // X.InterfaceC1429080nIA
        public final TemplateScene scene() {
            return TemplateScene.PIC_UGC;
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LJFF(C1429030nI5 c1429030nI5) {
            return C13BV.INSTANCE;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<Integer, Integer> LIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final boolean LIZIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<Integer> LIZLLL(List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZLLL(this, list, arrayList, c1429030nI5);
        }
    }), new Pair(TemplateScene.PHOTO_TEMPLATE, new InterfaceC1429080nIA() { // from class: X.0nID
        @Override // X.InterfaceC1429080nIA
        public final Pair<String, String> LJ() {
            return C1429090nIB.LJI(this);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LIZJ() {
            return C13BV.INSTANCE;
        }

        @Override // X.InterfaceC1429080nIA
        public final TemplateScene scene() {
            return TemplateScene.PHOTO_TEMPLATE;
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LJFF(C1429030nI5 c1429030nI5) {
            return C13BV.INSTANCE;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<Integer, Integer> LIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final boolean LIZIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<Integer> LIZLLL(List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZLLL(this, list, arrayList, c1429030nI5);
        }
    }), new Pair(TemplateScene.CANVAS_PHOTO_TEMPLATE, new InterfaceC1429080nIA() { // from class: X.0nIC
        @Override // X.InterfaceC1429080nIA
        public final List<String> LIZJ() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("TTTS");
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<String, String> LJ() {
            return C1429090nIB.LJI(this);
        }

        @Override // X.InterfaceC1429080nIA
        public final TemplateScene scene() {
            return TemplateScene.CANVAS_PHOTO_TEMPLATE;
        }

        @Override // X.InterfaceC1429080nIA
        public final List<String> LJFF(C1429030nI5 c1429030nI5) {
            Object obj;
            Object next;
            Iterator<Object> it2 = c1429030nI5.LIZ.iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next instanceof C1429040nI6) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            if (next instanceof C1429040nI6) {
                obj = next;
            }
            C1429040nI6 c1429040nI6 = (C1429040nI6) obj;
            if (c1429040nI6 != null && c1429040nI6.LIZ) {
                return C13BV.INSTANCE;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add("TTTS");
            return arrayList;
        }

        @Override // X.InterfaceC1429080nIA
        public final Pair<Integer, Integer> LIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final boolean LIZIZ(List<Long> list, List<Integer> list2, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZ(this, list, list2, c1429030nI5);
        }

        @Override // X.InterfaceC1429080nIA
        public final List<Integer> LIZLLL(List<Long> list, ArrayList<Integer> arrayList, C1429030nI5 c1429030nI5) {
            return C1429090nIB.LIZLLL(this, list, arrayList, c1429030nI5);
        }
    }));
    public static final Object LJ = new Object();

    public static void LIZIZ() {
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                if (!((Boolean) C0AYR.LIZ.getValue()).booleanValue()) {
                    if (LIZLLL) {
                        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "TemplateFeature", "loadNLELib: already loaded");
                        return;
                    } else {
                        LIZLLL = true;
                        NLE.loadNLELibrary$default(NLE.INSTANCE, true, C293550Bez.LIZ(), false, 4, null);
                        return;
                    }
                }
                if (LIZLLL) {
                    return;
                }
                synchronized (LJ) {
                    try {
                        if (!LIZLLL) {
                            NLE.loadNLELibrary$default(NLE.INSTANCE, true, C293550Bez.LIZ(), false, 4, null);
                            LIZLLL = true;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        }
    }

    public static Pair LIZ() {
        LIZIZ();
        List listLLIIII = C13LP.LLIIII(C1432220nNE.LIZ.LIZIZ(C13BV.INSTANCE, false));
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLLIIII, 10));
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
        }
        return new Pair(GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList), C311170CHr.LIZ());
    }

    public static Pair LIZJ(TemplateScene templateScene) {
        Pair<String, String> pairLJ;
        LIZIZ();
        InterfaceC1429080nIA interfaceC1429080nIA = (InterfaceC1429080nIA) ((LinkedHashMap) LIZIZ).get(templateScene);
        if (interfaceC1429080nIA == null || (pairLJ = interfaceC1429080nIA.LJ()) == null) {
            return LIZ();
        }
        return pairLJ;
    }
}
