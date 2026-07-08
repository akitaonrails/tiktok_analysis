package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.android.livesdkapi.host.editor.board.BoardTextFontStyleData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0xyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839560xyE {
    public static final Map<String, BoardTextFontStyleData> LIZ = Collections.synchronizedMap(new LinkedHashMap());
    public static final ConcurrentHashMap<String, Typeface> LIZIZ = new ConcurrentHashMap<>();
    public static String LIZJ = "default";
    public static String LIZLLL = "default";

    public static List LIZLLL() {
        Map<String, BoardTextFontStyleData> map = LIZ;
        if (map.isEmpty()) {
            return new ArrayList();
        }
        for (BoardTextFontStyleData boardTextFontStyleData : map.values()) {
            if (boardTextFontStyleData != null) {
                if (TextUtils.isEmpty(boardTextFontStyleData.LIZ()) || LIZIZ.get(boardTextFontStyleData.LIZ()) == null) {
                    String str = boardTextFontStyleData.LIZ;
                    if (str == null) {
                        str = "";
                    }
                    Typeface typefaceLJI = LJI(str);
                    String strLIZ = boardTextFontStyleData.LIZ();
                    if (strLIZ == null || strLIZ.length() <= 0) {
                        strLIZ = null;
                    }
                    if (typefaceLJI == null || strLIZ == null) {
                        boardTextFontStyleData.LIZIZ = 2;
                    } else {
                        LIZIZ.put(strLIZ, typefaceLJI);
                        boardTextFontStyleData.LIZIZ = 1;
                    }
                } else {
                    boardTextFontStyleData.LIZIZ = 1;
                }
            }
        }
        return new ArrayList(LIZ.values());
    }

    public static void LIZIZ(final Function0 function0) {
        if (!((ArrayList) LIZLLL()).isEmpty()) {
            function0.invoke();
        } else {
            AbstractC19484711Kz.LJII(new C1839600xyI(false)).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0xPo
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BoardFontStyleManager@c21c.ensurePanelLoadedThen$1");
                    function0.invoke();
                    C1C7U.LIZIZ("BoardFontStyleManager@c21c.ensurePanelLoadedThen$1");
                }
            }, new C09JN() { // from class: X.0xPp
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("BoardFontStyleManager@c21c.ensurePanelLoadedThen$2");
                    function0.invoke();
                    C1C7U.LIZIZ("BoardFontStyleManager@c21c.ensurePanelLoadedThen$2");
                }
            });
        }
    }

    public static String LIZJ(int i) {
        if (i == 1) {
            return LIZLLL;
        }
        return LIZJ;
    }

    public static Typeface LJ(String str) {
        BoardTextFontStyleData boardTextFontStyleData;
        String str2;
        Typeface typefaceLJI;
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, Typeface> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.isEmpty()) {
            return null;
        }
        String strLJIIJ = LJIIJ(str);
        Typeface typeface = concurrentHashMap.get(strLJIIJ);
        if (typeface == null && (boardTextFontStyleData = LIZ.get(strLJIIJ)) != null && (str2 = boardTextFontStyleData.LIZ) != null && (typefaceLJI = LJI(str2)) != null) {
            concurrentHashMap.put(strLJIIJ, typefaceLJI);
            typeface = typefaceLJI;
        }
        return typeface;
    }

    public static boolean LJFF(String str) {
        String strLJIIJ;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ConcurrentHashMap<String, Typeface> concurrentHashMap = LIZIZ;
        if (str != null) {
            strLJIIJ = LJIIJ(str);
        } else {
            strLJIIJ = null;
        }
        if (concurrentHashMap.get(strLJIIJ) == null) {
            return false;
        }
        return true;
    }

    public static Typeface LJI(String str) {
        if (TextUtils.isEmpty(str) || !new C0VSJ(str).exists()) {
            return null;
        }
        try {
            return C786410Ut5.x4(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static BoardTextFontStyleData LJII(Effect effect) {
        Gson gson;
        BoardTextFontStyleData boardTextFontStyleData;
        String strLIZ;
        String strLJJIFFI;
        String upperCase;
        Typeface typefaceLJI;
        try {
            InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
            if (interfaceC397701gdYn2 != null && (gson = interfaceC397701gdYn2.getGson()) != null && (boardTextFontStyleData = (BoardTextFontStyleData) gson.LJII(effect.getExtra(), BoardTextFontStyleData.class)) != null && (strLIZ = boardTextFontStyleData.LIZ()) != null) {
                Map<String, BoardTextFontStyleData> map = LIZ;
                BoardTextFontStyleData boardTextFontStyleData2 = map.get(strLIZ);
                if (boardTextFontStyleData2 == null) {
                    map.put(strLIZ, boardTextFontStyleData);
                } else {
                    BoardTextFontStyleData boardTextFontStyleData3 = boardTextFontStyleData2;
                    String strLIZ2 = boardTextFontStyleData.LIZ();
                    if (strLIZ2 != null && (upperCase = strLIZ2.toUpperCase(Locale.ROOT)) != null) {
                        strLJJIFFI = u.LJJIFFI(upperCase, " ", "", false);
                    } else {
                        strLJJIFFI = null;
                    }
                    boardTextFontStyleData3.fontIdentifier = strLJJIFFI;
                    boardTextFontStyleData2.fontDisplayName = boardTextFontStyleData.fontDisplayName;
                    boardTextFontStyleData2.fileName = boardTextFontStyleData.fileName;
                    boardTextFontStyleData2.fontSize = boardTextFontStyleData.fontSize;
                    boardTextFontStyleData = boardTextFontStyleData2;
                }
                boardTextFontStyleData.LIZJ = effect;
                ConcurrentHashMap<String, Typeface> concurrentHashMap = LIZIZ;
                if (concurrentHashMap.get(strLIZ) == null && !TextUtils.isEmpty(effect.getUnzipPath()) && C2355009Kq.LIZ(effect.getUnzipPath())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(effect.getUnzipPath());
                    String str = File.separator;
                    sbLIZ.append(str);
                    sbLIZ.append(boardTextFontStyleData.fileName);
                    Typeface typefaceLJI2 = LJI(C2188811AlT.LIZIZ(sbLIZ));
                    if (typefaceLJI2 != null) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(effect.getUnzipPath());
                        sbLIZ2.append(str);
                        sbLIZ2.append(boardTextFontStyleData.fileName);
                        boardTextFontStyleData.LIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        boardTextFontStyleData.LIZIZ = 1;
                        concurrentHashMap.put(strLIZ, typefaceLJI2);
                        return boardTextFontStyleData;
                    }
                    C089E c089e = new C089E(new C0VSJ(effect.getUnzipPath()).listFiles());
                    while (c089e.hasNext()) {
                        File file = (File) c089e.next();
                        if (file.isFile() && !u.LJIIZILJ(file.getAbsolutePath(), ".json", false) && (typefaceLJI = LJI(file.getAbsolutePath())) != null) {
                            boardTextFontStyleData.LIZ = file.getAbsolutePath();
                            boardTextFontStyleData.LIZIZ = 1;
                            LIZIZ.put(strLIZ, typefaceLJI);
                            return boardTextFontStyleData;
                        }
                    }
                }
                return boardTextFontStyleData;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return null;
    }

    public static String LJIIJ(String str) {
        return u.LJJIFFI(str.toUpperCase(Locale.ROOT), " ", "", false);
    }

    public static void LJIIIIZZ(Context context, final Function1 function1) {
        InterfaceC397701gd interfaceC397701gdYn2;
        if (context != null && C1815390xLF.LIZ() && (interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2()) != null) {
            interfaceC397701gdYn2.LJIILJJIL("pcs_font_panel", false, new IFetchEffectChannelListener() { // from class: X.0xyG
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                public final void onFail(ExceptionResult exceptionResult) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                    Iterator<Effect> it2 = effectChannelResponse.getAllCategoryEffects().iterator();
                    while (it2.hasNext()) {
                        C1839560xyE.LJII(it2.next());
                    }
                    Function1<List<BoardTextFontStyleData>, Unit> function12 = function1;
                    if (function12 != null) {
                        function12.invoke(C1839560xyE.LIZLLL());
                    }
                    if (C1815390xLF.LIZ()) {
                        Iterator<BoardTextFontStyleData> it3 = C1839560xyE.LIZ.values().iterator();
                        while (it3.hasNext()) {
                            String strLIZ = it3.next().LIZ();
                            if (strLIZ != null && C1839560xyE.LIZIZ.get(strLIZ) == null) {
                                InterfaceC397701gd interfaceC397701gdYn22 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
                                if (interfaceC397701gdYn22 != null) {
                                    interfaceC397701gdYn22.LJIILJJIL("pcs_font_panel", true, new IFetchEffectChannelListener() { // from class: X.0xyN
                                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                                        public final void onFail(ExceptionResult exceptionResult) {
                                        }

                                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                                        public final void onSuccess(EffectChannelResponse effectChannelResponse2) {
                                            Iterator<Effect> it4 = effectChannelResponse2.getAllCategoryEffects().iterator();
                                            while (it4.hasNext()) {
                                                C1839560xyE.LJII(it4.next());
                                            }
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
            });
        }
    }

    public static void LJIIIZ(Context context, final BoardTextFontStyleData boardTextFontStyleData, final InterfaceC1839510xy9 interfaceC1839510xy9) {
        if (context == null) {
            return;
        }
        if (!C1815390xLF.LIZ()) {
            String strLIZ = boardTextFontStyleData.LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            C1839660xyO.Companion.getClass();
            C1839620xyK.LIZ(new C1839630xyL(strLIZ, false, 0L, C1839660xyO.VE_PLUGIN_NOT_READY, 6));
            if (interfaceC1839510xy9 != null) {
                interfaceC1839510xy9.LIZIZ(false);
                return;
            }
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
        if (interfaceC397701gdYn2 != null) {
            interfaceC397701gdYn2.LJIIL(boardTextFontStyleData.LIZJ, new IFetchEffectListener() { // from class: X.0xyF
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    BoardTextFontStyleData boardTextFontStyleDataLJII = C1839560xyE.LJII(effect);
                    if (interfaceC1839510xy9 != null) {
                        String str = "";
                        if (boardTextFontStyleDataLJII != null) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                            String strLIZ2 = boardTextFontStyleDataLJII.LIZ();
                            if (strLIZ2 != null) {
                                str = strLIZ2;
                            }
                            C1839620xyK.LIZ(new C1839630xyL(str, false, jCurrentTimeMillis2, null, 10));
                            interfaceC1839510xy9.LIZ(boardTextFontStyleDataLJII, true);
                            return;
                        }
                        String strLIZ3 = boardTextFontStyleData.LIZ();
                        if (strLIZ3 != null) {
                            str = strLIZ3;
                        }
                        C1839660xyO.Companion.getClass();
                        C1839620xyK.LIZ(new C1839630xyL(str, false, 0L, C1839660xyO.FONT_DATA_PARSE_FAILED, 6));
                        interfaceC1839510xy9.LIZIZ(true);
                    }
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    Gson gson;
                    String strLIZ2;
                    BoardTextFontStyleData boardTextFontStyleData2;
                    try {
                        InterfaceC397701gd interfaceC397701gdYn22 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
                        String extra = null;
                        if (interfaceC397701gdYn22 != null && (gson = interfaceC397701gdYn22.getGson()) != null) {
                            if (effect != null) {
                                extra = effect.getExtra();
                            }
                            BoardTextFontStyleData boardTextFontStyleData3 = (BoardTextFontStyleData) gson.LJII(extra, BoardTextFontStyleData.class);
                            if (boardTextFontStyleData3 != null && (strLIZ2 = boardTextFontStyleData3.LIZ()) != null && (boardTextFontStyleData2 = C1839560xyE.LIZ.get(strLIZ2)) != null) {
                                boardTextFontStyleData2.LIZIZ = 2;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    String strLIZ3 = boardTextFontStyleData.LIZ();
                    if (strLIZ3 == null) {
                        strLIZ3 = "";
                    }
                    C1839660xyO.Companion.getClass();
                    C1839620xyK.LIZ(new C1839630xyL(strLIZ3, false, 0L, C1839670xyP.LIZ(exceptionResult), 6));
                    InterfaceC1839510xy9 interfaceC1839510xy92 = interfaceC1839510xy9;
                    if (interfaceC1839510xy92 != null) {
                        interfaceC1839510xy92.LIZIZ(true);
                    }
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [X.0xyJ, X.0xyR] */
    public static void LIZ(final Context context, List list, Function1 function1, final InterfaceC1685420txc interfaceC1685420txc, Function1 function12) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJIIJ((String) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        List listLJJJJI = C13LP.LJJJJI(arrayList2);
        ArrayList<String> arrayList3 = new ArrayList();
        for (Object obj2 : listLJJJJI) {
            if (!LJFF((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listLJJJJI) {
            if (LJFF((String) obj3)) {
                arrayList4.add(obj3);
            }
        }
        for (Object obj4 : arrayList4) {
            Boolean bool = Boolean.TRUE;
            interfaceC1685420txc.invoke(obj4, bool, 0L, bool, 0);
        }
        if (arrayList3.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                C1839620xyK.LIZ(new C1839630xyL((String) it3.next(), true, 0L, null, 12));
            }
            function12.invoke(Boolean.TRUE);
            return;
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            function1.invoke(it4.next());
        }
        if (context == null) {
            C1839660xyO.Companion.getClass();
            C1839660xyO c1839660xyO = C1839660xyO.CONTEXT_NULL;
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                C1839620xyK.LIZ(new C1839630xyL((String) it5.next(), true, 0L, c1839660xyO, 4));
            }
            for (Object obj5 : arrayList3) {
                Boolean bool2 = Boolean.FALSE;
                C1839660xyO.Companion.getClass();
                interfaceC1685420txc.invoke(obj5, bool2, 0L, bool2, Integer.valueOf(C1839660xyO.CONTEXT_NULL.getCode()));
            }
            function12.invoke(Boolean.FALSE);
            return;
        }
        C118300cf c118300cf = new C118300cf();
        c118300cf.element = arrayList3.size();
        final C013C c013c = new C013C();
        final C0J3K c0j3k = new C0J3K(c118300cf, function12, c013c);
        for (final String str : arrayList3) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final ?? r6 = new InterfaceC1839690xyR() { // from class: X.0xyJ
                @Override // X.InterfaceC1839690xyR
                public final void onSuccess() {
                    InterfaceC1685420txc<String, Boolean, Long, Boolean, Integer, Unit> interfaceC1685420txc2 = interfaceC1685420txc;
                    String str2 = str;
                    Boolean bool3 = Boolean.TRUE;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (jCurrentTimeMillis2 < 0) {
                        jCurrentTimeMillis2 = 0;
                    }
                    interfaceC1685420txc2.invoke(str2, bool3, Long.valueOf(jCurrentTimeMillis2), Boolean.FALSE, 0);
                    c0j3k.invoke();
                }

                @Override // X.InterfaceC1839690xyR
                public final void LIZ(C1839660xyO c1839660xyO2) {
                    c013c.element = true;
                    InterfaceC1685420txc<String, Boolean, Long, Boolean, Integer, Unit> interfaceC1685420txc2 = interfaceC1685420txc;
                    String str2 = str;
                    Boolean bool3 = Boolean.FALSE;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    if (jCurrentTimeMillis2 < 0) {
                        jCurrentTimeMillis2 = 0;
                    }
                    interfaceC1685420txc2.invoke(str2, bool3, Long.valueOf(jCurrentTimeMillis2), bool3, Integer.valueOf(c1839660xyO2.getCode()));
                    c0j3k.invoke();
                }
            };
            final String strLJIIJ = LJIIJ(str);
            if (LIZIZ.get(strLJIIJ) != null) {
                C1839620xyK.LIZ(new C1839630xyL(strLJIIJ, true, 0L, null, 12));
                r6.onSuccess();
            } else if (!C1815390xLF.LIZ()) {
                C1839660xyO.Companion.getClass();
                C1839660xyO c1839660xyO2 = C1839660xyO.VE_PLUGIN_NOT_READY;
                C1839620xyK.LIZ(new C1839630xyL(strLJIIJ, false, 0L, c1839660xyO2, 6));
                r6.LIZ(c1839660xyO2);
            } else {
                String strLJIIJ2 = null;
                if (!TextUtils.isEmpty(strLJIIJ)) {
                    Map<String, BoardTextFontStyleData> map = LIZ;
                    if (strLJIIJ != null) {
                        strLJIIJ2 = LJIIJ(strLJIIJ);
                    }
                    BoardTextFontStyleData boardTextFontStyleData = map.get(strLJIIJ2);
                    if (boardTextFontStyleData != null && boardTextFontStyleData.LIZJ != null) {
                        LJIIIZ(context, boardTextFontStyleData, new C1839680xyQ(r6));
                    }
                }
                final long jCurrentTimeMillis2 = System.currentTimeMillis();
                InterfaceC397701gd interfaceC397701gdYn2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).yn2();
                if (interfaceC397701gdYn2 != null) {
                    interfaceC397701gdYn2.LJIILJJIL("pcs_font_panel", false, new IFetchEffectChannelListener(jCurrentTimeMillis2, strLJIIJ, context, r6) { // from class: X.0xyH
                        public final /* synthetic */ String LIZ;
                        public final /* synthetic */ Context LIZIZ;
                        public final /* synthetic */ InterfaceC1839690xyR LIZJ;

                        @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
                        public final void onFail(ExceptionResult exceptionResult) {
                            System.currentTimeMillis();
                            C1839660xyO.Companion.getClass();
                            C1839660xyO c1839660xyOLIZ = C1839670xyP.LIZ(exceptionResult);
                            C1839620xyK.LIZ(new C1839630xyL(this.LIZ, false, 0L, c1839660xyOLIZ, 6));
                            this.LIZJ.LIZ(c1839660xyOLIZ);
                        }

                        @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                        public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                            Context context2;
                            Iterator<Effect> it6 = effectChannelResponse.getAllCategoryEffects().iterator();
                            while (it6.hasNext()) {
                                BoardTextFontStyleData boardTextFontStyleDataLJII = C1839560xyE.LJII(it6.next());
                                if (boardTextFontStyleDataLJII != null && Intrinsics.LJFF(this.LIZ, boardTextFontStyleDataLJII.LIZ()) && boardTextFontStyleDataLJII.LIZJ != null && (context2 = this.LIZIZ) != null) {
                                    C1839560xyE.LJIIIZ(context2, boardTextFontStyleDataLJII, new C1839680xyQ(this.LIZJ));
                                    return;
                                }
                            }
                            String str2 = this.LIZ;
                            C1839660xyO.Companion.getClass();
                            C1839660xyO c1839660xyO3 = C1839660xyO.EFFECT_MODEL_NOT_FOUND_ON_PANEL;
                            C1839620xyK.LIZ(new C1839630xyL(str2, false, 0L, c1839660xyO3, 6));
                            this.LIZJ.LIZ(c1839660xyO3);
                        }

                        {
                            this.LIZ = strLJIIJ;
                            this.LIZIZ = context;
                            this.LIZJ = r6;
                        }
                    });
                } else {
                    C1839660xyO.Companion.getClass();
                    r6.LIZ(C1839660xyO.BOARD_FONT_MANAGER_NULL);
                }
            }
        }
    }
}
