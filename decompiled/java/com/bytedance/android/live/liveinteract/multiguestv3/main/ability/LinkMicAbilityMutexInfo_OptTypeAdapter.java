package com.bytedance.android.live.liveinteract.multiguestv3.main.ability;

import X.C09CU;
import X.C09D6;
import X.C09DL;
import X.C473040Igo;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class LinkMicAbilityMutexInfo_OptTypeAdapter extends TypeAdapter<LinkMicAbilityMutexInfo> {
    public final Gson LIZ;

    public LinkMicAbilityMutexInfo_OptTypeAdapter(Gson gson) {
        this.LIZ = gson;
    }

    @Override // com.google.gson.TypeAdapter
    public final LinkMicAbilityMutexInfo read(C09CU c09cu) {
        if (c09cu.LJJLIIIJ() == C09D6.NULL) {
            return null;
        }
        LinkMicAbilityMutexInfo linkMicAbilityMutexInfo = new LinkMicAbilityMutexInfo(null, null, 3, null);
        c09cu.LIZIZ();
        while (c09cu.LJIIZILJ()) {
            String strLJJJJ = c09cu.LJJJJ();
            if (Intrinsics.LJFF(strLJJJJ, "mutex_scene")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    linkMicAbilityMutexInfo.mutexScene = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else if (Intrinsics.LJFF(strLJJJJ, "mutex_ability")) {
                if (c09cu.LJJLIIIJ() != C09D6.NULL) {
                    linkMicAbilityMutexInfo.mutexAbility = C473040Igo.LIZ(this.LIZ, c09cu, String.class);
                } else {
                    c09cu.LJJJJJL();
                }
            } else {
                c09cu.LJJZ();
            }
        }
        c09cu.LJII();
        return linkMicAbilityMutexInfo;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(C09DL c09dl, LinkMicAbilityMutexInfo linkMicAbilityMutexInfo) {
        LinkMicAbilityMutexInfo linkMicAbilityMutexInfo2 = linkMicAbilityMutexInfo;
        if (linkMicAbilityMutexInfo2 == null) {
            c09dl.LJIJJ();
            return;
        }
        c09dl.LIZLLL();
        c09dl.LJIILLIIL("mutex_scene");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicAbilityMutexInfo2.mutexScene, String.class);
        c09dl.LJIILLIIL("mutex_ability");
        C473040Igo.LIZLLL(this.LIZ, c09dl, linkMicAbilityMutexInfo2.mutexAbility, String.class);
        c09dl.LJII();
    }
}
