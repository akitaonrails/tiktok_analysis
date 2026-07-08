package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.ChunkPatch;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09F4, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09F4 {
    public static final C09F4 LIZLLL = new C09F4();
    public C0PO5 LIZ;
    public C09F5 LIZIZ = C09F5.SUCCESS;
    public String LIZJ;

    public final void LIZIZ() {
        C0PO5 c0po5 = this.LIZ;
        if (c0po5 != null) {
            int value = this.LIZIZ.getValue();
            C0PO5 c0po52 = C640870PBt.LIZ;
            if (!Intrinsics.LJFF(c0po5, c0po52)) {
                c0po5.LJJJJIZL = value;
            }
            C0PO5 c0po53 = this.LIZ;
            String str = this.LIZJ;
            c0po53.getClass();
            if (Intrinsics.LJFF(c0po53, c0po52)) {
                return;
            }
            c0po53.LJJJJJ = str;
        }
    }

    public final C09F4 LIZJ(C0PO5 c0po5) {
        this.LIZ = c0po5;
        LIZIZ();
        return LIZLLL;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean LIZ(Object obj, List<ChunkPatch> list) {
        Object objLIZ;
        if (list == null || list.size() == 0) {
            return false;
        }
        this.LIZIZ = C09F5.SUCCESS;
        this.LIZJ = null;
        HashMap<String, C09F6> map = new HashMap<>();
        for (ChunkPatch chunkPatch : list) {
            String str = chunkPatch.LJ;
            if (str != null) {
                this.LIZJ = str;
            }
            if (chunkPatch.op != null && chunkPatch.path != null) {
                ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(chunkPatch.path.trim().split("/")));
                if (arrayList.size() == 0) {
                    this.LIZIZ = C09F5.PATCH_PATH_NULL;
                } else {
                    chunkPatch.LIZIZ = arrayList;
                    chunkPatch.LIZ = obj;
                    chunkPatch.LIZLLL = map;
                    try {
                        objLIZ = C09F2.LIZ(obj, chunkPatch);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LIZIZ = C09F5.PATCH_HAS_EXCEPTION;
                    }
                    if (objLIZ != null) {
                        if (arrayList.size() == 1) {
                            chunkPatch.LIZJ = (String) ListProtector.get(arrayList, 0);
                            try {
                                String str2 = chunkPatch.op;
                                switch (str2.hashCode()) {
                                    case -934610812:
                                        if (str2.equals("remove")) {
                                            C09F3.LIZ.getClass();
                                            C09F3.LJ(objLIZ, chunkPatch);
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case 96417:
                                        if (str2.equals("add")) {
                                            C09F3.LIZ.getClass();
                                            C09F3.LIZ(objLIZ, chunkPatch);
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case 106438728:
                                        if (str2.equals("patch")) {
                                            C09F3.LIZ.getClass();
                                            C09F3.LIZLLL(objLIZ, chunkPatch);
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case 1093755131:
                                        if (str2.equals("reorder")) {
                                            C09F3.LIZ.getClass();
                                            C09F3.LJFF(objLIZ, chunkPatch);
                                        } else {
                                            continue;
                                        }
                                        break;
                                    case 1094496948:
                                        if (str2.equals("replace")) {
                                            C09F3.LIZ.getClass();
                                            C09F3.LJI(objLIZ, chunkPatch);
                                        } else {
                                            continue;
                                        }
                                        break;
                                    default:
                                        continue;
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                                this.LIZIZ = C09F5.PATCH_HAS_EXCEPTION;
                            }
                            TryCatchGuardChecker.doCheck(e2);
                            this.LIZIZ = C09F5.PATCH_HAS_EXCEPTION;
                        }
                    } else {
                        this.LIZIZ = C09F5.PATCH_NO_FOUND_OBJ;
                    }
                }
            } else {
                this.LIZIZ = C09F5.INVALID_PATCH;
            }
        }
        LIZIZ();
        return true;
    }
}
