package com.bytedance.android.btm.api.model;

import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes33.dex */
public class PageFinder {
    public String btmPageId;
    public Fragment fragment;
    public Object page;
    public View view;

    public boolean isEmpty() {
        return this.page == null && this.view == null && this.fragment == null && TextUtils.isEmpty(this.btmPageId);
    }

    public static PageFinder via(View view) {
        PageFinder pageFinder = new PageFinder();
        pageFinder.view = view;
        return pageFinder;
    }

    public static PageFinder via(Fragment fragment) {
        PageFinder pageFinder = new PageFinder();
        pageFinder.fragment = fragment;
        return pageFinder;
    }

    public static PageFinder via(Object obj) {
        PageFinder pageFinder = new PageFinder();
        pageFinder.page = obj;
        return pageFinder;
    }

    public static PageFinder via(String str) {
        PageFinder pageFinder = new PageFinder();
        pageFinder.btmPageId = str;
        return pageFinder;
    }
}
